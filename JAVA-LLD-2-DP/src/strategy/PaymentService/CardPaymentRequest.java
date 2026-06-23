package strategy.PaymentService;

public class CardPaymentRequest extends PaymentRequest{
    private String cardNumber;
    private String cvv;

    public CardPaymentRequest(double amount, String cardNumber, String cvv){
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
