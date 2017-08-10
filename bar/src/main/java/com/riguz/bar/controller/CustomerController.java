package com.riguz.bar.controller;

import com.riguz.bar.dto.CustomerInfo;
import com.riguz.bar.exception.CustomerNotFoundException;
import com.riguz.bar.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/customer/{id}")
    CustomerInfo getCustomerInfo(@PathVariable String id) {
        CustomerInfo info = this.customerService.getCustomerInfo(id);
        if (info == null)
            throw new CustomerNotFoundException();
        return info;
    }

}
