package Factory_DP.Solution;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {
    private NotificationFactory(){}

    private static final Map<NotificationEnum, Supplier<Notification>> registry = new EnumMap<>(NotificationEnum.class);

    static {
        registry.put(NotificationEnum.SMS,SMSNotification::new);
        registry.put(NotificationEnum.EMAIL,EmailNotification::new);
        registry.put(NotificationEnum.WHATSAPP,WhatsappNotification::new);
    }

    public static Notification createNotification(NotificationEnum type) {
       Supplier<Notification> supplier = registry.get(type);
       if(supplier == null){
           throw new IllegalArgumentException("Unknown notification type...!");
       }
       return supplier.get();
    }
}
