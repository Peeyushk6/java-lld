package Adaptor.PaymentGateway;

public class RazorPay {
    public boolean makePayment(double amount){
        System.out.println("Processing payment of " + amount + " through RazorPay");
        return true;
    }
}
