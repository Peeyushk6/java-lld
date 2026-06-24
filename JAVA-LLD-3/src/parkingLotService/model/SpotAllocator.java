package parkingLotService.model;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.interfaces.SpotAllocationStrategy;
import parkingLotService.strategy.SpotAllocationStrategyFactory;

import java.util.List;
import java.util.Optional;

public class SpotAllocator {
    private  final SpotAllocationStrategyFactory factory;

    public SpotAllocator(SpotAllocationStrategyFactory spotAllocationStrategyFactory){
        this.factory = spotAllocationStrategyFactory;
    }

    public Optional<ParkingSpot> allocate(Vehicle vehicle, ParkingLot parkingLot){

        SpotAllocationStrategy strategy = factory.getStrategy(vehicle);

        List<ParkingSpot> spots = parkingLot.getAllSpots();

        return strategy.allocate(vehicle, spots);
    }
}
