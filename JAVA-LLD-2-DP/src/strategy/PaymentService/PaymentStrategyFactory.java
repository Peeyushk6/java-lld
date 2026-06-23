package strategy.PaymentService;

    public class PaymentStrategyFactory {
    public static PaymentStrategy getStrategy(PaymentType paymentType){
        return switch (paymentType) {
            case CARD -> new CardPaymentStrategy();
            case UPI -> new UPIPaymentStrategy();
        };
    }
}
