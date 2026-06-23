package NotificationService_Solid;


import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

interface Notification1{
    public void send( String message);
}
class Email implements Notification1{
    public void send( String message){
        System.out.println("Sending Email: "+ message);
    }
}

class SMS implements Notification1{
    private static final Map<String, Supplier<Notification1>> registry1 = new HashMap<>();

    @Override
    public void send(String message) {
        System.out.println("Sending SMS: "+ message);
    }
}

class PUSH implements Notification1{
    @Override
    public void send(String message) {
        System.out.println("Sending Push: "+ message);
    }
}

//Remove even manual registration - Self-registration (Static block)
class WhatsAppNotification implements Notification1{
    static {
        NotificationFactory.register("WHATSAPP",WhatsAppNotification::new);
    }

    @Override
    public void send(String message) {
        System.out.println("WhatsApp: " + message);
    }
}
//public class NotificationService {
//    private Notification1 notification;
//
//    public NotificationService(Notification1 notification){
//        this.notification = notification;
//    }
//
//    public void NotifyUser(String message){
//        notification.send(message);
//    }
//}
//
//class NotificationFactory{
//    public static Notification1 getNotification(String type){
//        return switch (type) {
//            case "EMAIL" -> new Email();
//            case "SMS" -> new SMS();
//            case "PUSH" -> new PUSH();
//            default -> throw new IllegalArgumentException("Invalid Type");
//        };
//    }
//}

//class Main{
//    static void main() {
//        Notification1 notification1 = NotificationFactory.getNotification("SMS");
//        NotificationService service = new NotificationService(notification1);
//
//        service.NotifyUser("Hello Peeyush");
//    }
//}

class NotificationFactory{
    public static final Map<String, Supplier<Notification1>> registry = new HashMap<>();

    static {
        registry.put("EMAIL",Email::new);
        registry.put("SMS", SMS:: new);
        registry.put("PUSH",PUSH::new);
    }

    public static void register(String type,Supplier<Notification1> supplier){
        registry.put(type,supplier);
    }


    public static Notification1 getNotification(String type){
        Supplier<Notification1> supplier = registry.get(type);

        if(supplier == null){
            throw new IllegalArgumentException("Invalid type");
        }

        return supplier.get();
    }
}

public class NotificationService {
    private static final int noUse = 10;
    static void main() {

        //force class loading:
        try {
            Class.forName(
                    "NotificationService_Solid.WhatsAppNotification"
            );
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        NotificationFactory notificationFactory = new NotificationFactory();


        Notification1 notificaton = notificationFactory.getNotification("WHATSAPP");
        notificaton.send("Hey Peeyush");
        System.out.println(noUse);
    }
}