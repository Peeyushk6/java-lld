package Decorator.IceCream;

public class ChoclateSyrup implements IceCream{
    private IceCream iceCream;

    public ChoclateSyrup(IceCream iceCream){
        this.iceCream = iceCream;
    }

    @Override
    public double getCost() {
        return iceCream.getCost() + 10;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " + Chocolate Syrup";
    }
}
