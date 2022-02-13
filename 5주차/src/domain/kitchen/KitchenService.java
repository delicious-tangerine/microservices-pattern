package business.domain.kitchen;

import java.time.LocalDateTime;
import java.util.List;

import business.domain.ticket.Ticket;
import business.domain.ticket.TicketRepository;
import business.event.DomainEvent;
import business.publisher.DomainEventPublisher;

public class KitchenService {

    private TicketRepository ticketRepository;
    private DomainEventPublisher domainEventPublisher;

    public void accept(Long ticketId, LocalDateTime readBy) {
        Ticket ticket = ticketRepository.findById(ticketId);
        List<DomainEvent> events = ticket.accept(readBy);

        domainEventPublisher.publish(ticket, ticketId, events);
    }

}
