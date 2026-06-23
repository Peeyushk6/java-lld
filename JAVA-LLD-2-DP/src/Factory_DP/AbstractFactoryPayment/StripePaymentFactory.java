package Factory_DP.AbstractFactoryPayment;

public class StripePaymentFactory implements IPaymentFactory{
    @Override
    public PaymentProcessor createPaymentProcessor() {
        return new StripePaymentProcessor();
    }

    @Override
    public RefundProcessor createRefundProcessor() {
        return new StripeRefundProcessor();
    }
}
