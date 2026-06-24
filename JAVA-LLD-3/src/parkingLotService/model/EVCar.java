package parkingLotService.model;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.enums.SupportedVehicleType;

public class EVCar extends Vehicle{
    public EVCar(String licensePlate, ParkingPreference parkingPreference){
        super(licensePlate, SupportedVehicleType.EV, parkingPreference);
    }
}
