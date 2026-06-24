package parkingLotService.strategy;

import parkingLotService.interfaces.SpotAllocationStrategy;
import parkingLotService.model.ParkingSpot;
import parkingLotService.model.Vehicle;

import java.util.List;
import java.util.Optional;

public class NormalSpotAllocationStrategy implements SpotAllocationStrategy {
    @Override
    public Optional<ParkingSpot> allocate(Vehicle vehicle, List<ParkingSpot> spots){
        for(ParkingSpot spot: spots){
            if (spot.isAvailable() && spot.getSupportedVehicleType() == vehicle.getVehicleType()) {
                return Optional.of(spot);
            }
        }
        return  Optional.empty();
    }
}
