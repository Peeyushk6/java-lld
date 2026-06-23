package Observer;

import java.util.List;

public class ObserverRegistry {
    private static final List<UserObserver> OBSERVERS =
            List.of(new AnaylyticsObserver(), new EmailObserver(), new BonusObserver());


    public static List<UserObserver> getObservers(){
        return OBSERVERS;
    }
}
