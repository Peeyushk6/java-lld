package parkingLotService.model;

import parkingLotService.enums.SupportedVehicleType;

public abstract class Vehicle {
    private final String vehicleNumber;
    private final SupportedVehicleType vehicleType;

    protected Vehicle(String vehicleNumber, SupportedVehicleType vehicleType){
        this.vehicleNumber = vehicleNumber;
        this.vehicleType =  vehicleType;
    }

    public String getVehicleNumber(){
        return  vehicleNumber;
    }

    public SupportedVehicleType getVehicleType(){
        return vehicleType;
    }

}