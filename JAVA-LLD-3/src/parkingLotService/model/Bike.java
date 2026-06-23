package parkingLotService.model;

import parkingLotService.enums.SupportedVehicleType;

public class Bike extends Vehicle{
    public Bike( String licensePlate) {
        super(licensePlate, SupportedVehicleType.BIKE);
    }
}
