package parkingLotService.strategy;

import parkingLotService.interfaces.PricingServiceStrategy;

import java.time.Duration;
import java.time.LocalDateTime;

public class NormalPricingStrategy implements PricingServiceStrategy{
    double hourlyRate = 10.00;

    @Override
    public double getPrice(LocalDateTime entryTime, LocalDateTime exitTime) {
        long hours = Math.max(
                1,
                Duration.between(
                        entryTime,
                        exitTime
                ).toHours()
        );
        return hourlyRate * hours;    }

}
