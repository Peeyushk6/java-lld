package strategy.PaymentService;

public class UPIPaymentStrategy implements PaymentStrategy<UPIPaymentRequest>{

    @Override
    public void pay(UPIPaymentRequest request) {
        System.out.println(request.getUpiId());
    }
}
