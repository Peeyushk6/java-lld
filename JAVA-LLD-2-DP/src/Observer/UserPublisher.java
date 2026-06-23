package Observer;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class UserPublisher {
    public void notifyObservers(User user) {
        List<UserObserver> observers = ObserverRegistry.getObservers();

        List<CompletableFuture<Void>> futures = observers.stream()
                .map(observer -> CompletableFuture.runAsync(() -> {
                    try {
                        observer.update(user);
                    } catch (Exception e) {
                        System.out.println("Error updating observer: " + e.getMessage());
                    }
                }))
                .toList();

        CompletableFuture.allOf(
                futures.toArray(
                        new CompletableFuture[0]
                )
        ).join();
    }
}
