package parkingLotService.strategy;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.interfaces.SpotAllocationStrategy;
import parkingLotService.model.Vehicle;

public class SpotAllocationStrategyFactory {
    public SpotAllocationStrategy getStrategy(Vehicle vehicle){
        ParkingPreference parkingPreference = vehicle.getParkingPreference();
        return switch (parkingPreference){
            case VIP -> new VipSpotAllocationStrategy();
            case NORMAL -> new NormalSpotAllocationStrategy();
            default -> throw new IllegalArgumentException("Invalid parking preference: " + parkingPreference);
        };
    }
}
