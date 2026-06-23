package paymentSystem_bad_solid;

public class PaymentService {
    public void pay(String type, double amount){
        if(type.equals("UPI")){
            System.out.println("Paying via UPI: " + amount);
        }
        else if(type.equals("CARD")){
            System.out.println("Paying via CARD: " + amount);
        }
        else if(type.equals("NETBANKING")){
            System.out.println("Paying via NetBanking");
        }

        //logging
        System.out.println("Payment logged");

        //Saving to DB
        System.out.println("Saved to DB");
    }
}

class Main{
    static void main() {
        PaymentService paymentService = new PaymentService();
        paymentService.pay("NETBANKING",3232.32);
    }
}
