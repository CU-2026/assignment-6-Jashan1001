package com.parking.parkingsystem.service.impl;

import com.parking.parkingsystem.entity.ParkingLot;
import com.parking.parkingsystem.repository.ParkingLotRepository;
import com.parking.parkingsystem.service.ParkingLotService;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotServiceImpl implements ParkingLotService {

    private final ParkingLotRepository parkingLotRepository;

    public ParkingLotServiceImpl(ParkingLotRepository parkingLotRepository) {
        this.parkingLotRepository = parkingLotRepository;
    }

    @Override
    public ParkingLot createParkingLot(ParkingLot parkingLot) {
        return parkingLotRepository.save(parkingLot);
    }
}