package IceCream;

public class IceCreamFactory {
    public static IceCream createBase(ConeType coneType){
        return switch (coneType){
            case CHOCOLATE -> new ChoclateCone();
            case VANILLA -> new VanillaCone();
            case WAFFLE -> new WaffleCone();
        };
    }
}
