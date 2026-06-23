package Adaptor.PaymentGateway;

public class PaymentService {
    private final PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway){
        this.paymentGateway = paymentGateway;
    }

    public boolean processPayment(double amount) {
        return paymentGateway.doPayment(amount);
    }
}
