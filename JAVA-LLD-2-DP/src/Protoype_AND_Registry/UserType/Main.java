package Protoype_AND_Registry.UserType;

public class Main {
    static void main() {
        UserRegistry registry = new UserRegistry();

        User premiumUser = new PremiumUser("Peeyush Premium", "PeeyushPremium@gmail.com", 999.9);
        User adminUser = new AdminUser("Peeyush Admin", "PeeyushAdmin@gmail.com", 10);
        User guestUser = new GuestUser("Peeyush Guest", "PeeyushGuest@gmail.com", 7);


        registry.register("PREMIUM", premiumUser);
        registry.register("ADMIN", adminUser);
        registry.register("GUEST", guestUser);

        //Clone 1
        User premium1 = registry.get("PREMIUM");
        //Clone 2
        User premium2 = registry.get("PREMIUM");

        //Clone 3
        User admin1 = registry.get("ADMIN");

        //clone4
        User guest1 = registry.get("GUEST");

        System.out.println("Premium--------------------------------------");
        System.out.println("Premium Same object1?" + (premiumUser == premium1));
        System.out.println("Premium Same object2?" + (premium1 == premium2));

        System.out.println("Admin--------------------------------------");
        System.out.println("Admin Same object1?" + (adminUser == admin1));

        System.out.println("Guest--------------------------------------");
        System.out.println("Guest Same object1?" + (guestUser == guest1));

        System.out.println("Guest--------------------------------------" + guest1);
        System.out.println("Admin--------------------------------------" + admin1);
        System.out.println("Premium--------------------------------------" + premiumUser);
    }
}
