package strategy.paymentprocessor;

public class UpiPayment extends PaymentRequest{
    private String upiId;

    public UpiPayment(double amount, String upiId){
        super(amount);
        this.upiId = upiId;
    }
}
