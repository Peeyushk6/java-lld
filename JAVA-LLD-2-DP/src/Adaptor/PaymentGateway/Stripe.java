package Adaptor.PaymentGateway;

public class Stripe {
    public boolean charge(double amount){
        System.out.println("Processing payment of " + amount + " through Stripe");
        return false;
    }
}
