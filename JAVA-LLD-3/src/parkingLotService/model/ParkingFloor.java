package parkingLotService.model;

import java.util.List;

public class ParkingFloor {
   private final String floorId;
   private final List<ParkingSpot> spots;

   public ParkingFloor(String floorId, List<ParkingSpot> spots)
   {
       this.floorId = floorId;
       this.spots = spots;
   }

   public List<ParkingSpot> getSpots(){
       return spots;
   }
}

