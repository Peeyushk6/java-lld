package lsp;

interface Bird{
    void eat();
}

interface Flyable{
    void fly();
}

class Sparrow implements Bird, Flyable{
    public void eat(){
        System.out.println("Sparrow eating....");
    }
    public void fly(){
        System.out.println("Sparrow Flying....");
    }
}

class Penguin1 implements Bird{
    @Override
    public void eat() {
        System.out.println("Penguin Eating.....");
    }
}
public class lsp {
    static void main() {
        Bird bird1 = new Sparrow();
        Bird bird2 = new Penguin1();

        bird1.eat();
        bird2.eat();

        Flyable fly1 = new Sparrow();
        fly1.fly();

    }
}
