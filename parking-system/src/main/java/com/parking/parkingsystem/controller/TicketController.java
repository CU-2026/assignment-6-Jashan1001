package com.parking.parkingsystem.controller;

import com.parking.parkingsystem.entity.Ticket;
import com.parking.parkingsystem.service.TicketService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    private final TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    @PostMapping
    public Ticket createTicket(@Valid @RequestBody Ticket ticket) {
        return ticketService.createTicket(ticket);
    }
}