package strategy.PaymentService_Bad;

public class Main {
    static void main() {
        PaymentStrategy strategy = new CardPaymentStrategy();

        strategy.pay(new UPIPaymentRequest("ABC@upi")); // Gives you a ClassCastException at runtime because the strategy is expecting a CardPaymentRequest but receives a UPIPaymentRequest and
        // no compiler error is given we will solve this using the genric now where class cast exception will be give at the time of compilation
    }
}
