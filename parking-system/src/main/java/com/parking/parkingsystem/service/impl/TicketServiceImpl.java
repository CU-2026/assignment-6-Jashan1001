package com.parking.parkingsystem.service.impl;

import com.parking.parkingsystem.entity.Ticket;
import com.parking.parkingsystem.repository.TicketRepository;
import com.parking.parkingsystem.service.TicketService;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl implements TicketService {

    private final TicketRepository ticketRepository;

    public TicketServiceImpl(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    @Override
    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}