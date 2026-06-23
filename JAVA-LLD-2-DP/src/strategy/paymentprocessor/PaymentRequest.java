package strategy.paymentprocessor;

public class PaymentRequest {
    double amount;

    public PaymentRequest(double amount){
        this.amount = amount;
    }

    public double getAmount(){
        return amount;
    }
}
