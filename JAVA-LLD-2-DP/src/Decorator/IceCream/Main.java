package Decorator.IceCream;

public class Main {

    static void main() {
//        IceCream iceCream = new Brownie(
//                new ChoclateSyrup(
//                        new ChocolateCone()
//                )
//        );

        IceCream iceCream1 = new ChocolateCone();
//        System.out.println(iceCream1.getDescription() +" AND "+iceCream1.getCost());

        IceCream iceCream2 = new ChoclateSyrup(iceCream1);
//        System.out.println(iceCream2.getDescription() +" AND "+iceCream2.getCost());

        IceCream iceCream3 =   new Brownie(iceCream2);
        System.out.println(iceCream3.getDescription() +" AND "+iceCream3.getCost());

    }
}
