package srp;

class OrderService1{
    public void createOrder(){
        System.out.println("Order created");
    }
}

class DBSevice{
    public void saveOrder(){
        System.out.println("Saving to DB....");
    }
}

class EmailService{
    public void sendEmail(){
        System.out.println("Sending Email....");
    }
}

public class srp {
    static void main() {
        OrderService1 orderService = new OrderService1();
        DBSevice dbSevice = new DBSevice();
        EmailService emailService = new EmailService();

        orderService.createOrder();
        dbSevice.saveOrder();
        emailService.sendEmail();
    }

}
