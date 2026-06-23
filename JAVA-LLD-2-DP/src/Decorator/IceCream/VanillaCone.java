package Decorator.IceCream;

public class VanillaCone implements IceCream{
    @Override
    public double getCost() {
        return 20;
    }

    @Override
    public String getDescription() {
        return "Vanilla Cone";
    }
}
