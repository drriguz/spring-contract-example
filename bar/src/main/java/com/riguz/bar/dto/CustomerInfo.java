package com.riguz.bar.dto;

import java.util.ArrayList;
import java.util.List;

public class CustomerInfo {
    String customerId;
    String name;

    List<VehicleDetail> vehicles = new ArrayList<>();

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<VehicleDetail> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<VehicleDetail> vehicles) {
        this.vehicles = vehicles;
    }
}
