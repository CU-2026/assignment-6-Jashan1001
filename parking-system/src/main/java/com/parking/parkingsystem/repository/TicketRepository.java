package com.parking.parkingsystem.repository;

import com.parking.parkingsystem.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

}