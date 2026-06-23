package IceCream;

public class IceCreamBuilder {
    private IceCream iceCream;

    public IceCreamBuilder base(ConeType coneType){
        this.iceCream = IceCreamFactory.createBase(coneType);
        return this;
    }

    public IceCreamBuilder addBrownie(){
        iceCream = new Brownie(iceCream);
        return this;
    }

    public IceCreamBuilder addChocoChips(){
        iceCream = new ChocoChips(iceCream);
        return this;
    }

    public IceCreamBuilder addChocolateSyrup(){
        iceCream = new ChocolateSyrup(iceCream);
        return this;
    }

    public IceCreamBuilder applyFestiveDiscount(){
        iceCream = new FestivalDiscountDecorator(iceCream);
        return this;
    }

    public IceCreamBuilder applyPremiumDiscount(){
        iceCream = new PremiumDiscount(iceCream);
        return this;
    }

    public IceCreamBuilder enableLogging(){
        iceCream = new LoggingDecorator(iceCream);
        return this;
    }

    public IceCream build(){
        return iceCream;
    }
}
