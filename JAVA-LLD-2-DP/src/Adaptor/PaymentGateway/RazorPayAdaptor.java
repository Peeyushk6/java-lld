package Adaptor.PaymentGateway;

public class RazorPayAdaptor implements PaymentGateway{
    private final RazorPay razorPay;

    public RazorPayAdaptor(RazorPay razorPay){
        this.razorPay = razorPay;
    }
    @Override
    public boolean doPayment(double amount) {
        return razorPay.makePayment(amount);
    }
}
