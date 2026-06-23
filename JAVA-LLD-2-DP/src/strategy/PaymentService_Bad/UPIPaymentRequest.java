package strategy.PaymentService_Bad;

public class UPIPaymentRequest extends PaymentRequest{
    private String upiId;

    public UPIPaymentRequest(String upiId){
        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }
}
