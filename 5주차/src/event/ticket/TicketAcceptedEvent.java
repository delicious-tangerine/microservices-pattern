package business.event.ticket;

import java.time.LocalDateTime;

import business.event.DomainEvent;

public class TicketAcceptedEvent implements DomainEvent {
    public TicketAcceptedEvent(LocalDateTime readyBy) {
    }
}
