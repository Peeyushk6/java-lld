package parkingLotService.interfaces;

import parkingLotService.model.Ticket;

import java.util.Optional;

public interface TicketRepository {
    void save(Ticket ticket);
    Optional<Ticket> findById(String ticketId);
}
