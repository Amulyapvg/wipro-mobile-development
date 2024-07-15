package com.example.myapplication;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class VehicleInsuranceAdapter extends RecyclerView.Adapter<VehicleInsuranceAdapter.ViewHolder> {

    private List<VehicleInsurance> vehicleInsuranceList;

    public VehicleInsuranceAdapter(List<VehicleInsurance> vehicleInsuranceList) {
        this.vehicleInsuranceList = vehicleInsuranceList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_vehicle_insurance, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        VehicleInsurance vehicleInsurance = vehicleInsuranceList.get(position);
        holder.tvVehicleModel.setText(vehicleInsurance.getVehicleModel());
        holder.tvInsuranceNumber.setText(vehicleInsurance.getInsuranceNumber());
        holder.tvExpiryDate.setText(vehicleInsurance.getExpiryDate());
    }

    @Override
    public int getItemCount() {
        return vehicleInsuranceList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView tvVehicleModel;
        public TextView tvInsuranceNumber;
        public TextView tvExpiryDate;

        public ViewHolder(View itemView) {
            super(itemView);
            tvVehicleModel = itemView.findViewById(R.id.tvVehicleModel);
            tvInsuranceNumber = itemView.findViewById(R.id.tvInsuranceNumber);
            tvExpiryDate = itemView.findViewById(R.id.tvExpiryDate);
        }
    }
}