package strategy.PaymentService_WithGeneric;


public class Main {
    static void main() {
        CardPaymentStrategy strategy = new CardPaymentStrategy();

    strategy.pay(new CardPaymentRequest("3232","abc")); // Solved using generic
    }
}
