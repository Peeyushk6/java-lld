package String_Object;

final class I {
    private final String name;

    public I(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class Immutable {
    public static void main(String[] args) {
        I i1 = new I("abc");
        System.out.println(i1.getName());


        I i2 = new I("abcd");
        System.out.println(i2.getName());

    }
}
