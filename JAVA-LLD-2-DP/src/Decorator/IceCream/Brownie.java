package Decorator.IceCream;

public class Brownie implements IceCream {

    private final IceCream iceCream;

    public Brownie(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + with Brownie";
    }
}
