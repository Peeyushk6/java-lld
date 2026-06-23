package IceCream;

public class LoggingDecorator extends IceCreamDecorator{
    public LoggingDecorator(IceCream iceCream){
        super(iceCream);
    }

    @Override
    public double getCost(){
        System.out.println("Calculating cost for: " + iceCream.getDescription());
        double cost = iceCream.getCost();
        System.out.println("Cost: " + cost);
        return cost;
    }

    @Override
    public String getDescription(){
        return iceCream.getDescription();
    }
}
