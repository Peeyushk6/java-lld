package Factory_DP.AbstractFactoryPayment;

public class StripePaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("STRIPE PAYMENT PROCESSOR...!");
    }
}
