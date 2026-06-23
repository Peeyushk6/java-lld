package Facade.OrderBadSolution;

public class Order {
    String CustomerName;
    String orderId;
    public Order(String customerName, String orderId){
        this.CustomerName = customerName;
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
