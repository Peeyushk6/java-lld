package Decorator.IceCream;

public class OrangeCone implements IceCream{
    @Override
    public double getCost() {
        return 30;
    }

    @Override
    public String getDescription() {
        return "Orange Cone";
    }
}
