package Adaptor.PaymentGateway;

public class Main {
    static void main() {
        PaymentGateway paymentGateway = new StripeAdaptor(new Stripe());
        PaymentService paymentService = new PaymentService(paymentGateway);
        Boolean isApproved = paymentService.processPayment(100.0);
        System.out.println("Payment Approval " + isApproved);
    }
}
