package Factory_DP.AbstractFactoryPayment;

public interface IPaymentFactory {
    PaymentProcessor createPaymentProcessor();
    RefundProcessor createRefundProcessor();
}
