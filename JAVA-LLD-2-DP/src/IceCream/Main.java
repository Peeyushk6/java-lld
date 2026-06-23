package IceCream;

public class Main {

    static void main() {
        IceCream iceCream = new IceCreamBuilder()
                .base(ConeType.CHOCOLATE)
                .addBrownie()
                .addChocolateSyrup()
                .addChocoChips()
                .applyFestiveDiscount()
                .applyPremiumDiscount()
                .enableLogging()
                .build();

        System.out.println(iceCream.getDescription());
        System.out.println("Final Cost: " + iceCream.getCost());
    }
}
