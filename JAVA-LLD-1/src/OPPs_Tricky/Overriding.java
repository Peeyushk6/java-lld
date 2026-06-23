package OPPs_Tricky;

class A {

    void show() {
        System.out.println("A");
    }

}

class B extends A {

    void show() {
        System.out.println("B");
    }

}

public class Overriding {

    public static void main(String[] args) {

        A obj = new B();

        obj.show();

    }
}