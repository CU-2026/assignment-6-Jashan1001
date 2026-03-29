package com.parking.parkingsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    @Column(unique = true)
    @Email(message="Enter a valid email")
    private String email;


    private String phoneNo;

    @Pattern(regexp = "\\d{12}", message = "Aadhar number must be a 12-digit number")
    @Column(unique = true, nullable = false)
    private String aadharNumber;

    private String idProof;

    @OneToMany(mappedBy = "user")
    private List<Vehicle> vehicles;

}