package business.domain.ticket;

public interface TicketRepository {
    Ticket findById(Long id);
}
