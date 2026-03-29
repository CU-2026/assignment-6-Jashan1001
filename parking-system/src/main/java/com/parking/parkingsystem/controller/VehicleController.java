package com.parking.parkingsystem.controller;

import com.parking.parkingsystem.entity.Vehicle;
import com.parking.parkingsystem.service.VehicleService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @PostMapping
    public Vehicle registerVehicle(@Valid @RequestBody Vehicle vehicle) {
        return vehicleService.registerVehicle(vehicle);
    }

    // Add vehicle to a specific user
    @PostMapping("/user/{userId}")
    public ResponseEntity<Vehicle> addVehicleToUser(@PathVariable Long userId, @Valid @RequestBody Vehicle vehicle) {
        Vehicle saved = vehicleService.addVehicleToUser(userId, vehicle);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }

    // Get vehicle by registration number
    @GetMapping("/{registrationNo}")
    public ResponseEntity<Vehicle> getVehicleByRegistrationNo(@PathVariable String registrationNo) {
        Vehicle vehicle = vehicleService.getVehicleByRegistrationNo(registrationNo);
        return ResponseEntity.ok(vehicle);
    }
}