package parkingLotService.model;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.enums.SupportedVehicleType;

public class Car extends Vehicle{
    public Car(String licensePlate, ParkingPreference parkingPreference){
        super(licensePlate, SupportedVehicleType.CAR, parkingPreference);
    }

}
