package strategy.paymentprocessor;

public class UpiPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay() {
        System.out.println("Paying using UPI");
    }
}
