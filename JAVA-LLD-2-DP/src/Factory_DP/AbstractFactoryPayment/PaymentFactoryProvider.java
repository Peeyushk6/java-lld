package Factory_DP.AbstractFactoryPayment;

import java.util.EnumMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactoryProvider {
    private PaymentFactoryProvider(){};

    private static final Map<PaymentType, Supplier<IPaymentFactory>> registry =
            new EnumMap<>(PaymentType.class);

    static {
        registry.put(PaymentType.RAZORPAY, RazorpayPaymentFactory:: new);
        registry.put(PaymentType.STRIPE, StripePaymentFactory:: new);
    }

    public static IPaymentFactory getFactory(PaymentType type){
        return registry.get(type).get();
    }
}
