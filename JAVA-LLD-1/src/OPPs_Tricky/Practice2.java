package OPPs_Tricky;

public class Practice2 {
    static {
        System.out.println("Static Block");
    }
    {
        System.out.println("Instance Block");
    }
    Practice2(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        new Practice2();
        new Practice2();
    }
}
