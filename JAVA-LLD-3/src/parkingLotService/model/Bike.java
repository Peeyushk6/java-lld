package parkingLotService.model;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.enums.SupportedVehicleType;

public class Bike extends Vehicle{
    public Bike( String licensePlate, ParkingPreference parkingPreference) {
        super(licensePlate, SupportedVehicleType.BIKE,parkingPreference );
    }
}
