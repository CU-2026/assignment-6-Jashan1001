package com.parking.parkingsystem.controller;

import com.parking.parkingsystem.entity.ParkingLot;
import com.parking.parkingsystem.service.ParkingLotService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parking-lots")
public class ParkingLotController {

    private final ParkingLotService parkingLotService;

    public ParkingLotController(ParkingLotService parkingLotService) {
        this.parkingLotService = parkingLotService;
    }

    @PostMapping
    public ParkingLot createParkingLot(@Valid @RequestBody ParkingLot parkingLot) {
        return parkingLotService.createParkingLot(parkingLot);
    }
}