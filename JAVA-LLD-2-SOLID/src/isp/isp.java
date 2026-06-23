package isp;

interface Workable{
    void work();
}
interface Eatable{
    void eat();
}

class Human implements Workable,Eatable{
    @Override
    public void work() {
        System.out.println("Human Working...");
    }

    @Override
    public void eat() {
        System.out.println("Human Eating...");
    }
}

class Robot1 implements Workable{
    @Override
    public void work() {
        System.out.println("Robot Working...");
    }
}

public class isp {
    static void main() {
        Workable robot1 = new Robot1();
        robot1.work();

        Workable human = new Human();
        human.work();

        Eatable human1 = new Human();
        human1.eat();
    }
}
