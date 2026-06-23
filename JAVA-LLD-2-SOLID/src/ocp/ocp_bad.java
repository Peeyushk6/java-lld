package ocp;

class PaymentService {
    public void pay(String type){
        if(type.equals("UPI")){
            System.out.println("Pay via UPI");
        }
        else if(type.equals("CARD")){
            System.out.println("Pay via Card");
        }
    }
}

public class ocp_bad{
    static void main() {
        PaymentService service = new PaymentService();
        service.pay("UPI");
    }
}
