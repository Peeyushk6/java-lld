package strategy.PaymentService;

public class UPIPaymentRequest extends PaymentRequest{
    private String upiId;

    public UPIPaymentRequest(double anount, String upiId){
        super(anount);
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }
}
