package com.shoeb.ticket_triage.repository;

import com.shoeb.ticket_triage.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}