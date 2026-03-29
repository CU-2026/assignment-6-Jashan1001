package com.parking.parkingsystem.service.impl;

import com.parking.parkingsystem.entity.Vehicle;
import com.parking.parkingsystem.entity.User;
import com.parking.parkingsystem.repository.VehicleRepository;
import com.parking.parkingsystem.repository.UserRepository;
import com.parking.parkingsystem.repository.UserRepository;
import com.parking.parkingsystem.service.VehicleService;
import org.springframework.stereotype.Service;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.server.ResponseStatusException;
import org.springframework.http.HttpStatus;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;
    private final UserRepository userRepository;

    @Autowired
    public VehicleServiceImpl(VehicleRepository vehicleRepository, UserRepository userRepository) {
        this.vehicleRepository = vehicleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public Vehicle registerVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle addVehicleToUser(Long userId, Vehicle vehicle) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found"));
        vehicle.setUser(user);
        return vehicleRepository.save(vehicle);
    }

    @Override
    public Vehicle getVehicleByRegistrationNo(String registrationNo) {
        return vehicleRepository.findByRegNo(registrationNo)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Vehicle not found"));
    }
}