package strategy.PaymentService_WithGeneric;

public class CardPaymentStrategy implements PaymentStrategy<CardPaymentRequest> {
    @Override
    public void pay(CardPaymentRequest cardPaymentRequest){
        System.out.println(cardPaymentRequest.getCardNumber());
    }
}
