package Adaptor.Maps;

public class Main {
    static void main() {
        MapsService mapsService = new AppleMapsAdapter();

        RideService rideService = new RideService(mapsService);

        System.out.println(rideService.calculateRideDistance("A","B"));
    }
}
