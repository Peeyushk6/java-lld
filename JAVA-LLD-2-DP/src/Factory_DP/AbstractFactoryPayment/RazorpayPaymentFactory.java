package Factory_DP.AbstractFactoryPayment;

public class RazorpayPaymentFactory implements IPaymentFactory{
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new RazorpayPaymentProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new RazorpayRefundProcessor();
    }
}
