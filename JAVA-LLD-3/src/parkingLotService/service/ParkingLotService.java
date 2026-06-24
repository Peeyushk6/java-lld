package parkingLotService.service;

import parkingLotService.interfaces.TicketRepository;
import parkingLotService.model.*;

import java.util.Optional;

public class ParkingLotService {
    private final SpotAllocator allocator;
    private final TicketService ticketService;
    private final ParkingLot parkingLot;
    private final InvoiceService invoiceService;

    public ParkingLotService(SpotAllocator allocator, TicketService ticketService, ParkingLot parkingLot, InvoiceService invoiceService) {
        this.allocator = allocator;
        this.ticketService = ticketService;
        this.parkingLot = parkingLot;
        this.invoiceService = invoiceService;
    }


    public Ticket parkVehicle(Vehicle vehicle) {
        Optional<ParkingSpot> spot = allocator.allocate(vehicle, parkingLot);

        if (spot.isEmpty()) {
            throw new RuntimeException("No parking spot available");
        }

        spot.get().park(vehicle);

        try {
            return ticketService.createTicket(vehicle, spot.get());
        } catch (Exception ex) {
            spot.get().unpark();
            throw ex;
        }

    }

    public Invoice unparkVehicle(String ticketId){
        Ticket ticket = ticketService.closeTicket(ticketId);
        Invoice  invoice = invoiceService.generateInvoice(ticket);
        ticket.getParkingSpot().unpark();
        return invoice;
    }
}
