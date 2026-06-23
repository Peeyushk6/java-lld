package isp;
interface Worker{
    void work();
    void eat();

}

class Robot implements Worker{
    @Override
    public void work() {
        System.out.println("Robot Working");
    }

    @Override
    public void eat() {
        throw new UnsupportedOperationException("Workers can't eat");
    }
}

public class isp_bad {
    static void main() {

    }
}
