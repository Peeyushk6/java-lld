package parkingLotService.model;

import parkingLotService.enums.ParkingPreference;
import parkingLotService.enums.SupportedVehicleType;

public abstract class Vehicle {
    private final String vehicleNumber;
    private final SupportedVehicleType vehicleType;
    private final ParkingPreference parkingPreference;

    protected Vehicle(String vehicleNumber, SupportedVehicleType vehicleType, ParkingPreference parkingPreference){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType =  vehicleType;
        this.parkingPreference = parkingPreference;
    }

    public String getVehicleNumber(){
        return  vehicleNumber;
    }

    public SupportedVehicleType getVehicleType(){
        return vehicleType;
    }

    public ParkingPreference getParkingPreference(){
        return parkingPreference;
    }
}