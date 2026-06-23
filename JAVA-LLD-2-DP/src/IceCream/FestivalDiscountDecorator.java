package IceCream;

public class FestivalDiscountDecorator extends IceCreamDecorator{
    public FestivalDiscountDecorator(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public double getCost(){
        return iceCream.getCost() * 0.85; // Apply a 15% discount
    }

    @Override
    public String getDescription(){
        return iceCream.getDescription() + " [Festival]";
    }
}
