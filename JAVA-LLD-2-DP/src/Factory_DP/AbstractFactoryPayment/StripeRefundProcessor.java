package Factory_DP.AbstractFactoryPayment;

public class StripeRefundProcessor implements RefundProcessor{
    @Override
    public void processRefund() {
        System.out.println("STRIPE REFUND PROCESSOR...!");
    }
}
