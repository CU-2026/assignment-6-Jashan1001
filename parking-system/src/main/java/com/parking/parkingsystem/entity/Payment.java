package com.parking.parkingsystem.entity;

import com.parking.parkingsystem.enums.PaymentMode;
import com.parking.parkingsystem.enums.PaymentStatus;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "payments")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String referenceId;

    @NotNull
    private LocalDateTime timestamp;

    @NotNull
    private Double fare;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentMode modeOfTransaction;

    @NotNull
    @Enumerated(EnumType.STRING)
    private PaymentStatus status;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "ticket_id")
    private Ticket ticket;

}