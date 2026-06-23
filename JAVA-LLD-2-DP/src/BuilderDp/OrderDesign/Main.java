package BuilderDp.OrderDesign;

public class Main {
    static void main() {
        Order order = new Order.Builder()
                .setOrderId(12343)
                .setAmount(923.32)
                .setEmail("PeeyushK6@gmail.com")
                .setPhoneNo(98732983)
                .build()
                ;

        System.out.println("Order created successfully..... " +order);
        System.out.println("OrderId generated successfully..... " +order.getOrderId());
        System.out.println("PhoneNo fetched successfully..... " +order.getPhoneNo());
    }
}
