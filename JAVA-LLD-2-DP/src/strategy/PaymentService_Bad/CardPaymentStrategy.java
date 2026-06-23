package strategy.PaymentService_Bad;

public class CardPaymentStrategy implements PaymentStrategy{
    @Override
    public void pay(PaymentRequest request){
        CardPaymentRequest cardPaymentRequest = (CardPaymentRequest) request;
        System.out.println(cardPaymentRequest.getCardNumber() + " paid using card payment strategy");
    }
}
