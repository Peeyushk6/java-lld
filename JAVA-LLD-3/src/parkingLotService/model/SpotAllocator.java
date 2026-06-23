package parkingLotService.model;

import parkingLotService.interfaces.SpotAllocationStrategy;

import java.util.List;
import java.util.Optional;

public class SpotAllocator {
    private SpotAllocationStrategy strategy;

    public SpotAllocator(SpotAllocationStrategy strategy){
        this.strategy = strategy;
    }

    public Optional<ParkingSpot> allocate(Vehicle vehicle, ParkingLot parkingLot){
        //step 1
        List<ParkingSpot> spots = parkingLot.getAllSpots();

        return strategy.allocate(vehicle, spots);
    }
}
