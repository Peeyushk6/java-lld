package ocp;

interface Payment{
    void Pay();
}
class UPIService implements Payment{
    public void Pay(){
        System.out.println("Pay via UPI");
    }
}

class CardService implements Payment{
    public void Pay(){
        System.out.println("Pay via Card");
    }
}

class PaymentService1{
    public void ProcessPayment(Payment payment){
        payment.Pay();
    }
}

public class ocp {
    static void main() {
        PaymentService1 service = new PaymentService1();
        Payment payment = new CardService(); // change here only
        service.ProcessPayment(payment);
    }
}
