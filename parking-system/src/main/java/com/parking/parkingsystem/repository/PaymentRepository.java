package com.parking.parkingsystem.repository;

import com.parking.parkingsystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {

}