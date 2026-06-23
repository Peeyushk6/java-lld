package strategy.PaymentService;

public class Main {
    static void main() {
        PaymentType type = PaymentType.CARD;
        PaymentStrategy<CardPaymentRequest> strategy = PaymentStrategyFactory.getStrategy(type);
        strategy.pay(new CardPaymentRequest(123, "12/25", "123"));
    }
}
