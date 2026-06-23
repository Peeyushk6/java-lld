package strategy.paymentprocessor;

public class PaymentStrategyFactory {
    public PaymentStrategy getPaymentStrategy(PaymentType type){
        return switch (type){
            case UPI -> new UpiPaymentStrategy();
            case CARD -> new CardPaymentStrategy();
            default -> throw new IllegalArgumentException("Invalid payment type");
        };
    }
}
