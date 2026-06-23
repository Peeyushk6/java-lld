package Adaptor.Maps;

public class RideService {
    private final MapsService mapsService;

    public RideService(MapsService mapsService){
        this.mapsService = mapsService;
    }

    public double calculateRideDistance(String source, String destination){
        return mapsService.calculateDistance(source, destination);
    }
}
