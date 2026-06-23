package Adaptor.Maps;

public class AppleMapsAdapter implements MapsService{
    private final AppleMaps appleMaps;

    public AppleMapsAdapter(){
        this.appleMaps = new AppleMaps();
    }
    @Override
    public double calculateDistance(String source, String destination) {
        return appleMaps.computeRoute(source, destination);
    }
}
