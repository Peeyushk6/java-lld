package IceCream;

public class PremiumDiscount extends IceCreamDecorator{

    public PremiumDiscount(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public double getCost(){
        return iceCream.getCost() * 0.9; // Apply a 10% discount
    }

    @Override
    public String getDescription(){
        return iceCream.getDescription() + " [Premium]";
    }
}
