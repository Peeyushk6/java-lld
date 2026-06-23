package IceCream;

public class WaffleCone implements IceCream{
    @Override
    public double getCost() {
        return 60;
    }

    @Override
    public String getDescription() {
        return "Waffle Cone";
    }
}
