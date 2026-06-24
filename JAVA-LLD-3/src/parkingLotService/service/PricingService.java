package parkingLotService.service;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.interfaces.PricingServiceStrategy;
import parkingLotService.strategy.PricingAllocationStrategyFactory;

import java.time.LocalDateTime;

public class PricingService {
    private final PricingAllocationStrategyFactory pricingAllocationStrategyFactory;
    public PricingService(PricingAllocationStrategyFactory pricingAllocationStrategyFactory) {
        this.pricingAllocationStrategyFactory = pricingAllocationStrategyFactory;
    }

    public double getCalculatedPrice(ParkingPreference preference, LocalDateTime entryTime, LocalDateTime exitTime){
        PricingServiceStrategy strategy = pricingAllocationStrategyFactory.getPricingStrategy(preference);
        return strategy.getPrice(entryTime, exitTime);
    }
}