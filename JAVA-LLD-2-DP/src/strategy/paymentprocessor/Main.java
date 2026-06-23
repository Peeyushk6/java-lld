package strategy.paymentprocessor;

import strategy.PaymentService.CardPaymentRequest;

public class Main {
    static void main() {
        PaymentType type = PaymentType.CARD;
        PaymentRequest request = new CardPayment(1230000000, "12/25", "123");
        PaymentStrategy strategy = new PaymentStrategyFactory().getPaymentStrategy(type);
        strategy.pay();
    }
}
