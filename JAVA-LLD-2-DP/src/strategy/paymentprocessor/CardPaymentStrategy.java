package strategy.paymentprocessor;

public class CardPaymentStrategy implements PaymentStrategy{
    public CardPaymentStrategy(){

    }
    public void pay(){
        System.out.println("Paying using card");
    }
}
