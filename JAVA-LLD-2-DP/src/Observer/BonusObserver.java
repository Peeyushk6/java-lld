package Observer;

public class BonusObserver implements UserObserver{
    @Override
    public void update(User user) {
            System.out.println("Bonus added to user account " + user.getName());
    }
}
