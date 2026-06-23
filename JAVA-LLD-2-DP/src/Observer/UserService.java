package Observer;

public class UserService {
    private final UserPublisher publisher;

    public UserService(UserPublisher publisher){
        this.publisher = publisher;
    }

    public void registerUser(User user){
        saveUser(user);
        publisher.notifyObservers(user);
    }

    private void saveUser(User user){
        System.out.println();
        System.out.println("User saved");
    }
}
