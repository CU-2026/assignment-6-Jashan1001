package com.parking.parkingsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
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

    private String idProof;

    @OneToMany(mappedBy = "user")
    private List<Vehicle> vehicles;

}