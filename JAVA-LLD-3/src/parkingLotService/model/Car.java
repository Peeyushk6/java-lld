package parkingLotService.model;

import parkingLotService.enums.SupportedVehicleType;

public class Car extends Vehicle{
    public Car(String licensePlate){
        super(licensePlate, SupportedVehicleType.CAR);
    }

}
