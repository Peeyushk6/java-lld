package Adaptor.PaymentGateway;

public class StripeAdaptor implements PaymentGateway{
    private final Stripe stripe;

    public StripeAdaptor(Stripe stripe){
        this.stripe = stripe;
    }

    @Override
    public boolean doPayment(double amount) {
        return stripe.charge(amount);
    }
}
