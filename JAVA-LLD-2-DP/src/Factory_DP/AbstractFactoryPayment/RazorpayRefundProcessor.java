package Factory_DP.AbstractFactoryPayment;

public class RazorpayRefundProcessor implements RefundProcessor{
    @Override
    public void processRefund() {
        System.out.println("RAZORPAY REFUND PROCESSOR...!");
    }
}
