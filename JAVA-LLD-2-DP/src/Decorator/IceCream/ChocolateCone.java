package Decorator.IceCream;

public class ChocolateCone implements IceCream{
    @Override
    public double getCost() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Chocolate Cone";
    }
}
