package notificationservice_bad_solid;

public class NotificationService {
    public void send(String type, String message){
        if(type.equals("EMAIL")){
            System.out.println("Sending Email: " + message);
        }
        else if(type.equals("SMS")){
            System.out.println("Sending SMS: "+ message);
        }
        else if(type.equals("PUSH")){
            System.out.println("Sending Push: "+ message);
        }
        else {
            throw new UnsupportedOperationException("Not allowd");
        }
    }
}

class  Main{
    static void main() {
        NotificationService notificationService = new NotificationService();
        notificationService.send("EMAIL","My self from email");
        notificationService.send("SMS","My self from sms");
        notificationService.send("PUSH","My self from push");
        notificationService.send("PUSHPA","My self from pushpa");
    }
}
