package strategy.paymentprocessor;

public class CardPayment extends PaymentRequest{
    private String cardNumber;
    private String cvv;

    public CardPayment(double amount, String cardNumber, String cvv){
        super(amount);
        this.cardNumber = cardNumber;
        this.cvv = cvv;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getCvv() {
        return cvv;
    }
}
