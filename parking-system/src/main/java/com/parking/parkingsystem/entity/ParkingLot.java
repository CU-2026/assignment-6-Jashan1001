package com.parking.parkingsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "parking_lots")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ParkingLot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Parking lot name is required")
    @Column(nullable = false)
    private String name;

    @NotNull(message = "Capacity must be provided")
    @Min(value = 1, message = "Capacity must be at least 1")
    private Integer capacity;

    @NotBlank(message = "Location is required")
    private String location;

    @NotBlank(message = "Address is required")
    private String address;

    @NotNull(message = "Floors must be specified")
    @Min(value = 1, message = "Floors must be at least 1")
    private Integer floors;

    @NotNull(message = "Fare must be specified")
    @Min(value = 0, message = "Fare cannot be negative")
    private Double fare;

}