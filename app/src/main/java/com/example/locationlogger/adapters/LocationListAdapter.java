package com.example.locationlogger.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.locationlogger.R;

import java.util.HashMap;
import java.util.List;

public class LocationListAdapter extends RecyclerView.Adapter<LocationListAdapter.LocationViewHolder> {

    List<HashMap<String, String>> dataSet;

    public static class LocationViewHolder extends RecyclerView.ViewHolder  {

        public TextView itemTimeText;
        public TextView itemAddressText;
        public TextView itemGpsText;

        public LocationViewHolder(View view) {
            super(view);

            itemTimeText = view.findViewById(R.id.itemTimeText);
            itemAddressText = view.findViewById(R.id.itemAddressText);
            itemGpsText = view.findViewById(R.id.itemGpsText);
        }
    }

    public LocationListAdapter(List<HashMap<String, String>> data) {
        dataSet = data;
    }

    @NonNull
    @Override
    public LocationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.location_item, parent, false);
        LocationViewHolder viewHolder = new LocationViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull LocationViewHolder holder, int position) {
        String time = dataSet.get(position).get("time");
        String address = dataSet.get(position).get("address");
        String gps = dataSet.get(position).get("gps");

        holder.itemTimeText.setText(time);
        holder.itemAddressText.setText(address);
        holder.itemGpsText.setText(gps);
    }

    @Override
    public int getItemCount() {
        return (dataSet == null) ? 0 : dataSet.size();
    }
}
