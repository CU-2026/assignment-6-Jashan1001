package com.parking.parkingsystem.entity;

import com.parking.parkingsystem.enums.FuelType;
import com.parking.parkingsystem.enums.WheelerType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "vehicles")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Registration number cannot be empty")
    @Column(name = "reg_no", unique = true, nullable = false)
    private String regNo;

    @NotNull(message = "Wheeler type is required")
    @Enumerated(EnumType.STRING)
    private WheelerType wheelerType;

    @NotNull(message = "Fuel type is required")
    @Enumerated(EnumType.STRING)
    private FuelType fuelType;

    @NotNull(message = "Vehicle must belong to a user")
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;

}