package parkingLotService.service;

import parkingLotService.interfaces.TicketRepository;
import parkingLotService.model.ParkingSpot;
import parkingLotService.model.Ticket;
import parkingLotService.model.Vehicle;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository){
        this.ticketRepository = ticketRepository;
    }
    public Ticket createTicket(Vehicle vehicle, ParkingSpot spot) {
        String ticketId = UUID.randomUUID().toString();
        Ticket ticket = new Ticket(ticketId, vehicle, spot, LocalDateTime.now());
        ticketRepository.save(ticket); // need to write try catch block as well
        return ticket;
    }

    public Ticket closeTicket(String ticketId){
        Optional<Ticket> ticket = ticketRepository.findById(ticketId);
        if (ticket.isEmpty()) {
            throw new RuntimeException("Ticket not found");
        }
        ticket.get().close(LocalDateTime.now());
        return ticket.get();
    }
}
