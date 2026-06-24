package parkingLotService.model;

import java.time.LocalDateTime;

public class Ticket {
    private final String ticketId;
    private final Vehicle vehicle;
    private final ParkingSpot parkingSpot;
    private final LocalDateTime entryTime;
    private LocalDateTime exitTime;

    public Ticket(String ticketId, Vehicle vehicle, ParkingSpot spot, LocalDateTime time) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.parkingSpot = spot;
        this.entryTime = time;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void close(LocalDateTime time) {
        this.exitTime = time;
    }

    public LocalDateTime getExitTime() {
        return this.exitTime;
    }
}
