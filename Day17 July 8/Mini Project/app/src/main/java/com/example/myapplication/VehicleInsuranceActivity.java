package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class VehicleInsuranceActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private VehicleInsuranceAdapter adapter;
    private List<VehicleInsurance> vehicleInsuranceList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vehicle_insurance);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        vehicleInsuranceList = new ArrayList<>();
        vehicleInsuranceList.add(new VehicleInsurance("Toyota Camry", "INS1234567890", "2024-12-31"));
        vehicleInsuranceList.add(new VehicleInsurance("Honda Accord", "INS9876543210", "2025-05-15"));
        vehicleInsuranceList.add(new VehicleInsurance("Ford Mustang", "INS1122334455", "2024-08-20"));

        adapter = new VehicleInsuranceAdapter(vehicleInsuranceList);
        recyclerView.setAdapter(adapter);
    }
}
