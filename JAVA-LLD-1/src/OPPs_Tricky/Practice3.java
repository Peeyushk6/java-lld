package OPPs_Tricky;

public class Practice3 {
    void print(int a){
        System.out.println("int");
    }

    void print(long a){
        System.out.println("long");
    }

    public static void main(String[] args) {
        Practice3 t = new Practice3();

        t.print(10L);
    }
}
