package com.parking.parkingsystem.controller;

import com.parking.parkingsystem.entity.Vehicle;
import com.parking.parkingsystem.service.VehicleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public Vehicle registerVehicle(@RequestBody Vehicle vehicle) {
        return vehicleService.registerVehicle(vehicle);
    }
}