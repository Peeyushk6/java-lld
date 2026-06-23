package Observer;

public class Main {
    static void main() {
        User user = new User("Peeyush", "Singh");
        User user1 = new User("Peeyush1", "Singh1");

        UserService userService = new UserService(new UserPublisher());
        userService.registerUser(user);
        userService.registerUser(user1);

    }
}
