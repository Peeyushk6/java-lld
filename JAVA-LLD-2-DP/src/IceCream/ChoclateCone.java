package IceCream;

public class ChoclateCone implements IceCream{
    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String getDescription() {
        return "Chocolate Cone";
    }
}
