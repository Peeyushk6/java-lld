package Facade.Order;


public class FoodOrderFacade {
    private final OrderValidationService validationService;

    private final PaymentService paymentService;

    private final InventoryService inventoryService;

    private final DeliveryPartnerService deliveryPartnerService;

    private final NotificationService notificationService;

    public FoodOrderFacade(
            OrderValidationService orderValidationService,
            PaymentService paymentService,
            InventoryService inventoryService,
            DeliveryPartnerService deliveryPartnerService,
            NotificationService notificationService
    ){
        this.validationService = orderValidationService;
        this.paymentService = paymentService;
        this.inventoryService = inventoryService;
        this.deliveryPartnerService = deliveryPartnerService;
        this.notificationService = notificationService;
    }

    public void placeOrder(Order order){
        validationService.validateOrder(order);
        paymentService.processPayment(order);
        inventoryService.reserveInventory(order);
        deliveryPartnerService.assignPartner(order);
        notificationService.sendNotification(order);
    }
}
