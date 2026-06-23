package OPPs_Tricky;

public class FinalReference
{
    public static void main(String[] args) {

        final StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");

        System.out.println(sb);
    }
}
