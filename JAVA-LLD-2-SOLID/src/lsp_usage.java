import java.util.ArrayList;
import java.util.List;

interface Bird{
    void eat();
    void makeSound();
}

interface Flyable{
    void fly();
}

class Sparrow implements Bird, Flyable{
    @Override
    public void eat() {
        System.out.println("Sparrow Eating...");
    }

    @Override
    public void makeSound() {
        System.out.println("Sparrow making Sound....");
    }


    @Override
    public void fly() {
        System.out.println("Sparrow Flying....");
    }
}

class Penguin implements Bird{
    @Override
    public void makeSound() {
        System.out.println("Penguin making Sound....");
    }

    @Override
    public void eat() {
        System.out.println("Penguin Eating....");
    }
}
public class lsp_usage {
    static void main() {
        List<Flyable> flyingBirds = new ArrayList<>();
        flyingBirds.add(new Sparrow());

        for (Flyable f : flyingBirds){
            f.fly();
        }

        List<Bird> bird = new ArrayList<>();
        bird.add(new Sparrow());
        bird.add(new Penguin());
        for (Bird f : bird){
            f.eat();
            f.makeSound();
        }


    }
}
