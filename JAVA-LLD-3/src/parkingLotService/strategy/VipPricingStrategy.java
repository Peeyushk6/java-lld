package parkingLotService.strategy;

import parkingLotService.interfaces.PricingServiceStrategy;

import java.time.Duration;
import java.time.LocalDateTime;

public class VipPricingStrategy implements PricingServiceStrategy {
    double hourlyRate = 20.00;
    @Override
    public double getPrice(LocalDateTime entryTime, LocalDateTime exitTime) {
        long hours = Math.max(
                1,
                Duration.between(
                        entryTime,
                        exitTime
                ).toHours()
        );
        return hourlyRate * hours;
    }
}
