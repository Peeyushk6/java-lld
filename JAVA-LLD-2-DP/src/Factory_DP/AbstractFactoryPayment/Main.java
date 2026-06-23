package Factory_DP.AbstractFactoryPayment;

public class Main {
    static void main() {
        PaymentType type = PaymentType.RAZORPAY;


        IPaymentFactory payment = PaymentFactoryProvider.getFactory(type);
        PaymentProcessor paymentProcessor =  payment.createPaymentProcessor();
        RefundProcessor refundProcessor = payment.createRefundProcessor();

        paymentProcessor.processPayment();
        refundProcessor.processRefund();
    }
}
