package IceCream;

public abstract class ToppingDecorator extends IceCreamDecorator{
    private static final double TOPPING_DISCOUNT = 0.8;

    protected ToppingDecorator(IceCream iceCream) {
        super(iceCream);
    }

    protected double applyToppingDiscount(double cost) {
        return cost * TOPPING_DISCOUNT;
    }
}
