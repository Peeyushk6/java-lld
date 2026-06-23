package Facade.Order;

public class Order {
    private String orderId;

    public Order(String orderId){
        this.orderId = orderId;
    }

    public String getOrderId(){
        return  orderId;
    }
}
