package strategy.PaymentService_WithGeneric;

public interface PaymentStrategy <T extends PaymentRequest> {
    void pay(T request);
}
