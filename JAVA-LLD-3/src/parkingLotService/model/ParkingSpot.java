package parkingLotService.model;

import parkingLotService.enums.SpotStatus;
import parkingLotService.enums.SupportedVehicleType;

public class ParkingSpot {
    private String spotId;
    private SpotStatus status;
    private Vehicle vehicle;
    private SupportedVehicleType supportedVehicleType;

    public ParkingSpot(String spotId, SupportedVehicleType supportedVehicleType){
        this.spotId = spotId;
        this.supportedVehicleType = supportedVehicleType;
        this.vehicle = null;
        this.status = SpotStatus.AVAILABLE;
    }

    public boolean isAvailable(){
        return status == SpotStatus.AVAILABLE;

    }

    public String getSpotId(){
        return spotId;
    }

    public SupportedVehicleType getSupportedVehicleType(){
        return supportedVehicleType;
    }


    public void park(Vehicle vehicle){
        if(vehicle.getVehicleType() != this.supportedVehicleType){
            throw new IllegalArgumentException("Vehicle type not supported for this spot.");
        }
        if(vehicle == null){
            throw new IllegalArgumentException("Vehicle cannot be null.");
        }
        if(!isAvailable()){
            throw new IllegalStateException("Spot already occupied.");
        }
        this.vehicle = vehicle;
        this.status = SpotStatus.OCCUPIED;
    }

    public void unpark(){
        if(isAvailable()){
            throw new IllegalStateException("Spot is already available.");
        }
        this.vehicle = null;
        this.status = SpotStatus.AVAILABLE;
    }
}
