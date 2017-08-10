package com.riguz.bar.service;

import com.riguz.bar.agent.VehicleAgent;
import com.riguz.bar.dto.CustomerInfo;
import com.riguz.bar.dto.VehicleDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    @Autowired
    private VehicleAgent vehicleAgent;

    public CustomerInfo getCustomerInfo(String customerId){
        CustomerInfo customer = new CustomerInfo();
        customer.setCustomerId(customerId);
        customer.setName("James Wang");
        VehicleDetail detail = this.vehicleAgent.getVehicleDetail("WDC1660631A7506890");
        customer.getVehicles().add(detail);
        return customer;
    }

}
