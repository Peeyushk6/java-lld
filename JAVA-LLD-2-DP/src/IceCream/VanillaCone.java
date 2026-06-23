package IceCream;

public class VanillaCone implements IceCream{
    @Override
    public double  getCost() {
        return 40;
    }

    @Override
    public  String getDescription() {
        return "Vanilla Cone";
    }
}
