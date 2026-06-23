package IceCream;

public class ChocoChips extends ToppingDecorator{
    public ChocoChips(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public double getCost(){
        return iceCream.getCost() + applyToppingDiscount(15);
    }

    @Override
    public String getDescription(){
        return iceCream.getDescription() + " + Choco Chips";
    }
}
