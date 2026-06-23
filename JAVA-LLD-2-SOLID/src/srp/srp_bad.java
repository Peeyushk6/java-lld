package srp;

class OrderService{
    public void createOrder(){
        System.out.println("Order Created");
        System.out.println("Saving to DB....");
        System.out.println("Sending Email...");
    }
}
public class srp_bad {
    static void main() {
        OrderService1 service = new OrderService1();
        service.createOrder();
    }
}
