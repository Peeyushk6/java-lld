package parkingLotService.model;

import parkingLotService.enums.SupportedVehicleType;

public class EVCar extends Vehicle{
    public EVCar(String licensePlate){
        super(licensePlate, SupportedVehicleType.EV);
    }
}
