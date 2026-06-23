package strategy.PaymentService;

public class CardPaymentStrategy implements PaymentStrategy<CardPaymentRequest>{
    @Override
    public void pay(CardPaymentRequest request) {
        System.out.println(request.getCardNumber() + "Card Number");
        System.out.println(request.getCvv() + "Cvv Number");
        System.out.println(request.getAmount() + " paid using card payment strategy");

    }
}
