package com.parking.parkingsystem.service.impl;

import com.parking.parkingsystem.entity.Payment;
import com.parking.parkingsystem.repository.PaymentRepository;
import com.parking.parkingsystem.service.PaymentService;
import org.springframework.stereotype.Service;

@Service
public class PaymentServiceImpl implements PaymentService {

    private final PaymentRepository paymentRepository;

    public PaymentServiceImpl(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    @Override
    public Payment createPayment(Payment payment) {
        return paymentRepository.save(payment);
    }
}