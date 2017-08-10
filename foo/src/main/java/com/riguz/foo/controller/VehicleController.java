package com.riguz.foo.controller;

import com.riguz.foo.dto.VehicleDetail;
import com.riguz.foo.exception.VehicleNotFoundException;
import com.riguz.foo.service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

@GetMapping("/vehicle/{vin}")
VehicleDetail getVehicleDetail(@PathVariable String vin){
   VehicleDetail item = this.vehicleService.getVehicle(vin);
   if(item == null)
       throw new VehicleNotFoundException();
   return item;
}

}
