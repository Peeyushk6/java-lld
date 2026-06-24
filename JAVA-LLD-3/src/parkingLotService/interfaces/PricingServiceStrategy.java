package parkingLotService.interfaces;

import java.time.LocalDateTime;

public interface PricingServiceStrategy {
    double getPrice(LocalDateTime entryTime, LocalDateTime exitTime);
}
