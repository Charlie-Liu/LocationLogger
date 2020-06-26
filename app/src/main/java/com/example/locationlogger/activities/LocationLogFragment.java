package com.example.locationlogger.activities;

import android.content.pm.PackageManager;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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

public class LocationLogFragment extends Fragment implements View.OnClickListener {

    private LocationUtil mLocationUtil;

    private TextView mTimeText;
    private TextView mAddressText;
    private TextView mGPSText;
    private Button mLogButton;

    public static LocationLogFragment newInstance() {
        return new LocationLogFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.location_log_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle saveInstanceState) {
        super.onViewCreated(view, saveInstanceState);

        mAddressText = (TextView) view.findViewById(R.id.addressText);
        mTimeText = (TextView) view.findViewById(R.id.timeText);
        mGPSText = (TextView) view.findViewById(R.id.gpsText);
        mLogButton = (Button) view.findViewById(R.id.logButton);
        mLogButton.setOnClickListener(this);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mLocationUtil = new LocationUtil(getActivity());
        mLocationUtil.setLocationService();
        if (!mLocationUtil.isLocationPermitted()) {
            mLocationUtil.requestLocationPermission();
        }
        mLocationUtil.createLocationCallback();
    }

    @Override
    public void onResume() {
        super.onResume();
        if (mLocationUtil.isLocationPermitted()) {
            mLocationUtil.startLocationUpdates();
        } else {
            mLocationUtil.requestLocationPermission();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        mLocationUtil.stopLocationUpdates();
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

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.logButton:
                submitLog();
                break;
        }
    }

    public void submitLog() {
        mLogButton.setEnabled(false);

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

        // gRPC client
        try {
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
            Toast.makeText(getContext(), "Upload success!", Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            System.out.println("Server has some problems, cannot connect with server.");
        } finally {
            mLogButton.setEnabled(true);
        }
    }
}