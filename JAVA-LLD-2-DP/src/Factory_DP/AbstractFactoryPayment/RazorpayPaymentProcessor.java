package Factory_DP.AbstractFactoryPayment;

public class RazorpayPaymentProcessor implements PaymentProcessor{
    @Override
    public void processPayment() {
        System.out.println("RAZORPAY PAYMENT PROCESSOR...!");
    }
}
