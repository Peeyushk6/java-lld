package strategy.PaymentService;

public interface PaymentStrategy <T extends PaymentRequest>{
    void pay(T request);
}
