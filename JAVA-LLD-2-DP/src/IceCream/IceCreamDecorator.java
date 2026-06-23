package IceCream;

public abstract class IceCreamDecorator implements IceCream{
    protected final IceCream iceCream;

    protected IceCreamDecorator(IceCream iceCream){
        this.iceCream = iceCream;
    }
}
