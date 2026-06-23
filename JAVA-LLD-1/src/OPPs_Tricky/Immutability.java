package OPPs_Tricky;

public class Immutability {
    public static void main(String[] args) {
        String s = "hello";

        String k = s.concat(" world");

        System.out.println(s);

        System.out.println(k);

    }
}
