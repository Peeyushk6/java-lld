package IceCream;

public class ChocolateSyrup extends ToppingDecorator{

    public ChocolateSyrup(IceCream  iceCream){
        super(iceCream);
    }

    @Override
    public double getCost(){
        return iceCream.getCost() + applyToppingDiscount(10);
    }

    @Override
    public String getDescription(){
        return iceCream.getDescription() + " + Chocolate Syrup";
    }
}
