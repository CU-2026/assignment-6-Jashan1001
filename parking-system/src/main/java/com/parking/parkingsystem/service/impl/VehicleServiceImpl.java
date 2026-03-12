package com.parking.parkingsystem.service.impl;

import com.parking.parkingsystem.entity.Vehicle;
import com.parking.parkingsystem.repository.VehicleRepository;
import com.parking.parkingsystem.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }
}