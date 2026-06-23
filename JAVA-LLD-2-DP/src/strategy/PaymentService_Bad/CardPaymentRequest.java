package strategy.PaymentService_Bad;

public class CardPaymentRequest extends PaymentRequest{
    private String cardNumber;

    private String cvv;

    public CardPaymentRequest(String cardNumber, String cvv){
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
