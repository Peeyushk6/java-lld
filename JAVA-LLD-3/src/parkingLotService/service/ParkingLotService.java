package parkingLotService.service;

import parkingLotService.model.*;

import java.util.Optional;

public class ParkingLotService {
    private SpotAllocator allocator;
    private TicketService ticketService;
    private ParkingLot parkingLot;

    public ParkingLotService(SpotAllocator allocator, TicketService ticketService, ParkingLot parkingLot){
        this.allocator = allocator;
        this.ticketService = ticketService;
        this.parkingLot = parkingLot;
    }


    public Ticket parkVehicle(Vehicle vehicle){
        Optional<ParkingSpot> spot = allocator.allocate(vehicle,parkingLot);

        if(spot.isEmpty()){
            throw new RuntimeException("No parking spot available");
        }

        spot.get().park(vehicle);

        return ticketService.createTicket(vehicle, spot.get());


    }
}
