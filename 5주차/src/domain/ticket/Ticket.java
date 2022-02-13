package business.domain.ticket;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;

import business.domain.Domain;
import business.event.DomainEvent;
import business.event.ticket.TicketAcceptedEvent;

public class Ticket implements Domain {

    private Long id;
    private LocalDateTime readyBy;
    private LocalDateTime acceptTime;

    public List<DomainEvent> accept(LocalDateTime readyBy) {
        this.acceptTime = LocalDateTime.now();
        this.readyBy = readyBy;
        return Collections.singletonList(new TicketAcceptedEvent(readyBy));
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getReadyBy() {
        return readyBy;
    }

    public LocalDateTime getAcceptTime() {
        return acceptTime;
    }
}
