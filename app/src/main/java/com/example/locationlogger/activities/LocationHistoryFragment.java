package com.example.locationlogger.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.grpc.LocationInfo;
import com.example.grpc.LocationListRequest;
import com.example.grpc.LocationLoggerServiceGrpc;
import com.example.locationlogger.R;
import com.example.locationlogger.adapters.LocationListAdapter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;

public class LocationHistoryFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private LinearLayoutManager  mLayoutManager;
    private SwipeRefreshLayout mSwipeRefreshLayout;

    private List<HashMap<String, String>> mDataSet;

    private boolean isLoading;

    public static LocationHistoryFragment newInstance() {
        return new LocationHistoryFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDataSet = new ArrayList<>();
        isLoading = false;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.location_history_fragment, container, false);
    }

    @Override
    public void onViewCreated(View view, Bundle saveInstanceState) {
        super.onViewCreated(view, saveInstanceState);

        mSwipeRefreshLayout = (SwipeRefreshLayout) view.findViewById(R.id.swipeContainer);
        mSwipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                if (!isLoading) {
                    refreshLocationSet();
                    new Handler().postDelayed(new Runnable() {
                        @Override public void run() {
                            mSwipeRefreshLayout.setRefreshing(false);
                        }
                    }, 2000);
                }
            }
        });

        mRecyclerView = (RecyclerView) view.findViewById(R.id.historyRecyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new LocationListAdapter(mDataSet);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);

                if (!isLoading) {
                    int pos = mLayoutManager.findLastCompletelyVisibleItemPosition();
                    if (pos >= mDataSet.size()-1) {
                        String lastStrTime = mDataSet.get(mDataSet.size()-1).get("time");
                        loadLocation(lastStrTime);
                    }
                }
            }
        });
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onResume() {
        super.onResume();

        refreshLocationSet();
    }

    private void refreshLocationSet() {
        mDataSet.clear();

        Date currentTime = Calendar.getInstance().getTime();
        DateFormat timeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String strTime = timeFormat.format(currentTime);
        loadLocation(strTime);
    }

    private void loadLocation(String strTime) {
        isLoading = true;

        final ManagedChannel channel = ManagedChannelBuilder.forAddress("10.0.2.2", 8080)
                .usePlaintext()
                .build();
        LocationLoggerServiceGrpc.LocationLoggerServiceStub stub = LocationLoggerServiceGrpc.newStub(channel);
        LocationListRequest request = LocationListRequest.newBuilder()
                .setTime(strTime)
                .setNum(5)
                .build();

        stub.locationList(request, new StreamObserver<LocationInfo>() {
            @Override
            public void onNext(LocationInfo value) {
                System.out.println(value);

                String strTime = value.getTime();
                String address = value.getAddress();
                String latitude = String.valueOf(value.getLatitude());
                String longitude = String.valueOf(value.getLongitude());
                String gps = String.format("(%s, %s)", latitude, longitude);

                HashMap<String, String> location = new HashMap<>();
                location.put("time", strTime);
                location.put("address", address);
                location.put("gps", gps);
                mDataSet.add(location);
            }

            @Override
            public void onError(Throwable t) {
            }

            @Override
            public void onCompleted() {
                channel.shutdownNow();
                getActivity().runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        mAdapter.notifyDataSetChanged();
                    }
                });
                isLoading = false;
            }
        });
    }
}