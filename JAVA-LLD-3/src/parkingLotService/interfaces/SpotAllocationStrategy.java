package parkingLotService.interfaces;

import parkingLotService.model.ParkingSpot;
import parkingLotService.model.Vehicle;

import java.util.List;
import java.util.Optional;

public interface SpotAllocationStrategy {
    Optional<ParkingSpot> allocate(Vehicle vehicle, List<ParkingSpot> spots);
}

