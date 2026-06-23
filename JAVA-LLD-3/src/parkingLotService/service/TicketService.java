package parkingLotService.service;

import parkingLotService.model.ParkingSpot;
import parkingLotService.model.Ticket;
import parkingLotService.model.Vehicle;

import java.time.LocalDateTime;
import java.util.UUID;

public class TicketService {

    public Ticket createTicket(Vehicle vehicle, ParkingSpot spot){
        String ticketId = UUID.randomUUID().toString();
        return new Ticket(ticketId, vehicle, spot, LocalDateTime.now());

    }
}
