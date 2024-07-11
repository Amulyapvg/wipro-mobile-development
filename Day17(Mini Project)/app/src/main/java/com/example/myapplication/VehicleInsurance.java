package com.example.myapplication;

public class VehicleInsurance {
    private String vehicleModel;
    private String insuranceNumber;
    private String expiryDate;

    public VehicleInsurance(String vehicleModel, String insuranceNumber, String expiryDate) {
        this.vehicleModel = vehicleModel;
        this.insuranceNumber = insuranceNumber;
        this.expiryDate = expiryDate;
    }

    public String getVehicleModel() {
        return vehicleModel;
    }

    public String getInsuranceNumber() {
        return insuranceNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }
}