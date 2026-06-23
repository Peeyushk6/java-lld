package Adaptor.Maps;

public class GoogleMapsAdapter implements MapsService{
    private GoogleMaps googleMaps;

    public GoogleMapsAdapter(){
        this.googleMaps = new GoogleMaps();
    }
    @Override
    public double calculateDistance(String source, String destination) {
        return googleMaps.getDistance(source, destination);
    }
}
