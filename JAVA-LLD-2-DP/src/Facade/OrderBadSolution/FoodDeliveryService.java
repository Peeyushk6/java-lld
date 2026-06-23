package Facade.OrderBadSolution;



public class FoodDeliveryService {
    Order order;
    public void placeOrder(Order order){
        validateOrder(order);

        processPayment(order);

        reserveInventory(order);

        assignDeliveryPartner(order);

        sendNotification(order);
    }

    private void validateOrder(Order order){
        System.out.println("Validating order for :" + order.getCustomerName() +" Order Id :" + order.getOrderId());
    }

    private void processPayment(Order order){
        System.out.println("Processing payment for :" + order.getCustomerName() +" Order Id :" + order.getOrderId());
    }

    private void reserveInventory(Order order){
        System.out.println("Reserving inventory for :" + order.getCustomerName() +" Order Id :" + order.getOrderId());
    }

    private void assignDeliveryPartner(Order order){
        System.out.println("Assigning delivery partner for :" + order.getCustomerName() +" Order Id :" + order.getOrderId());
    }

    private void sendNotification(Order order){
        System.out.println("Sending notification for :" + order.getCustomerName() +" Order Id :" + order.getOrderId());
    }

}
