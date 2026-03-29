package com.parking.parkingsystem.service;

import com.parking.parkingsystem.entity.Vehicle;

public interface VehicleService {

    Vehicle registerVehicle(Vehicle vehicle);

    Vehicle addVehicleToUser(Long userId, Vehicle vehicle);

    Vehicle getVehicleByRegistrationNo(String registrationNo);

}