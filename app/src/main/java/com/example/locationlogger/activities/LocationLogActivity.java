package com.example.locationlogger.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.grpc.LocationAddResponse;
import com.example.grpc.LocationInfo;
import com.example.grpc.LocationLoggerServiceGrpc;
import com.example.locationlogger.R;
import com.example.locationlogger.util.LocationUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class LocationLogActivity extends AppCompatActivity {

    private LocationUtil mLocationUtil;

    private TextView mTimeText;
    private TextView mAddressText;
    private TextView mGPSText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location_log);

        mAddressText = findViewById(R.id.addressText);
        mTimeText = findViewById(R.id.timeText);
        mGPSText = findViewById(R.id.gpsText);

        mLocationUtil = new LocationUtil(LocationLogActivity.this);
        mLocationUtil.setLocationService();
        if (!mLocationUtil.isLocationPermitted()) {
            mLocationUtil.requestLocationPermission();
        }
        mLocationUtil.createLocationCallback();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mLocationUtil.stopLocationUpdates();
    }

    @Override
    protected void onResume() {
        super.onResume();
        if (mLocationUtil.isLocationPermitted()) {
            mLocationUtil.startLocationUpdates();
        } else {
            mLocationUtil.requestLocationPermission();
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String permissions[], int[] grantResults) {
        if (requestCode == LocationUtil.PERMISSIONS_REQUEST_LOCATION) {
            if (grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                if (mLocationUtil.isLocationPermitted()) {
                    Log.i("Location", "Location request is permitted.");
                    mLocationUtil.startLocationUpdates();
                }

            } else {
                Log.i("Location", "Location request is denied.");
                mLocationUtil.stopLocationUpdates();
            }
        }
    }

    public void submitLog(View view) {
        String address = mLocationUtil.getAddressName();
        mAddressText.setText(address);

        double latitude = mLocationUtil.getAddressLatitude();
        double longitude = mLocationUtil.getAddressLongitude();
        String gpsCoordinate = "("
                + String.valueOf(latitude)
                + " , "
                + String.valueOf(longitude)
                + ")";
        mGPSText.setText(gpsCoordinate);

        Date currentTime = Calendar.getInstance().getTime();
        DateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = timeFormat.format(currentTime);
        mTimeText.setText(strTime);

        final ManagedChannel channel = ManagedChannelBuilder.forAddress("10.0.2.2", 8080)
                .usePlaintext()
                .build();
        LocationLoggerServiceGrpc.LocationLoggerServiceBlockingStub stub = LocationLoggerServiceGrpc.newBlockingStub(channel);
        LocationInfo request = LocationInfo.newBuilder()
                .setAddress(address)
                .setLatitude(latitude)
                .setLongitude(longitude)
                .setTime(strTime)
                .build();

        LocationAddResponse response = stub.locationAdd(request);
        System.out.println(response);
        channel.shutdownNow();
    }
}