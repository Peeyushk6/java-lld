package parkingLotService.strategy;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.interfaces.PricingServiceStrategy;

public class PricingAllocationStrategyFactory {
    public PricingServiceStrategy getPricingStrategy(ParkingPreference preference){
        return switch (preference){
            case VIP -> new VipPricingStrategy();
            case NORMAL -> new NormalPricingStrategy();
            default -> throw new IllegalArgumentException("Invalid parking preference: " + preference);
        };
    }
}
