package parkingLotService.model;

import java.util.List;

public class ParkingLot {
    private final List<ParkingFloor> floors;
    private final String parkingLotId;

    public ParkingLot(String parkingLotId, List<ParkingFloor> floors){
        this.parkingLotId = parkingLotId;
        this.floors = floors;
    }

    public List<ParkingFloor> getFloors(){
        return floors;
    }

    public List<ParkingSpot> getAllSpots(){
        return floors.stream()
                .flatMap(floor -> floor.getSpots().stream())
                        .toList();
    }
}
