package parkingLotService.repository;


import parkingLotService.interfaces.TicketRepository;
import parkingLotService.model.Ticket;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class InMemoryTicketRepository implements TicketRepository {
    final Map<String, Ticket> tickets = new HashMap<>();

    @Override
    public void save(Ticket ticket){
        tickets.put(ticket.getTicketId(),ticket);
    }

    @Override
    public Optional<Ticket> findById(String ticketId){
        return Optional.ofNullable(tickets.get(ticketId));
    }
}
