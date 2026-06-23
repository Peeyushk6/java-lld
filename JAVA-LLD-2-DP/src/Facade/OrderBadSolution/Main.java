package Facade.OrderBadSolution;

public class Main {
    static void main() {
        FoodDeliveryService foodDeliveryService = new FoodDeliveryService();
        Order order = new Order("111", "John Doe");
        foodDeliveryService.placeOrder(order);
    }
}
