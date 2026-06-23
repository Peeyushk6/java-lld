package Facade.Order;

public class Main {
    static void main() {
        Order order = new Order("111");
        FoodOrderFacade foodOrderFacade = new FoodOrderFacade(
                new OrderValidationService(),
                new PaymentService(),
                new InventoryService(),
                new DeliveryPartnerService(),
                new NotificationService()
        );

        foodOrderFacade.placeOrder(order);
    }
}
