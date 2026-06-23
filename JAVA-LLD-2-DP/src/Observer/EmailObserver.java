package Observer;

public class EmailObserver implements UserObserver{
    public void update(User user){
        System.out.println("Email sent to user " + user.getName());
    }
}
