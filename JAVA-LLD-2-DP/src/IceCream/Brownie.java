package IceCream;


public class Brownie extends ToppingDecorator{
    public Brownie(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double getCost(){
        return iceCream.getCost() + applyToppingDiscount(20);
    }

    @Override
    public String getDescription(){
        return iceCream.getDescription() + " + Brownie";
    }

}
