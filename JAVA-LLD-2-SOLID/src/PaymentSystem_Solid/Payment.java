package PaymentSystem_Solid;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

interface Payment {
    void pay(double amount);
}

interface Logger{
    void log();
}

interface DB{
    void save();
}

class UPIService implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via UPI: " + amount);
    }
}

class CardService implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via Card: " + amount);
    }
}

class NetBankingService implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Paying via NetBanking: " + amount);
    }
}

class LoggerService implements Logger{
    @Override
    public void log() {
        System.out.println("Payment Logged...");
    }
}

class DBService implements DB{
    @Override
    public void save() {
        System.out.println("Saving to DB...");
    }
}

class PaymentService{
    private Payment payment;
    private Logger logger;
    private DB db;
    PaymentService(Payment payment, Logger logger, DB db){
        this.payment = payment;
        this.db = db;
        this.logger = logger;
    }

    public void processPayment(double amount){
        payment.pay(amount);
        logger.log();
        db.save();
    }
}

class PaymentFactory {
    private Map<String, Supplier<Payment>> registry = new HashMap<>();

    public PaymentFactory() {
        registry.put("UPI", UPIService::new);
        registry.put("CARD", CardService::new);
        registry.put("NETBANKING", NetBankingService::new);

    }

    public Payment getPayment(String type) {
        Supplier<Payment> supplier = registry.get(type);
        if (supplier == null) throw new IllegalArgumentException();
        return supplier.get();
    }
}

class Main{
    static void main() {
        PaymentFactory paymentFactory = new PaymentFactory();
        Payment payment = paymentFactory.getPayment("NETBANKING");
        PaymentService service = new PaymentService(payment,new LoggerService(),new DBService());
        service.processPayment(1000);
    }
}