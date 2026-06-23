package Observer;

public class AnaylyticsObserver implements UserObserver{
    @Override
    public void update(User user) {
            System.out.println("Analytics updated for user " + user.getName());
    }
}
