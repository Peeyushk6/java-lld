package OPPs_Tricky;

public class Practice1 {
    Practice1(){
        print();
    }

    void print(){
        System.out.println("Test");
    }
}

class Child extends Practice1{
    int x = 10;

    void print(){
        System.out.println(x);
    }

    public static void main(String[] args) {
        Child c = new Child();
        c.print();
    }
}