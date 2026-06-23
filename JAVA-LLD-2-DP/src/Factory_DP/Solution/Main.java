package Factory_DP.Solution;

public class Main {
    static void main() {
        NotificationEnum type = NotificationEnum.WHATSAPP;
        Notification notification = NotificationFactory.createNotification(type);
        notification.send();
    }
}
