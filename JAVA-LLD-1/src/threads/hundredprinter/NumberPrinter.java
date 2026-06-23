package threads.hundredprinter;

public class NumberPrinter implements Runnable{
    public static int nextNumberPrinter = 1;
    private int numberToPrint;

    @Override
    public void run() {
        System.out.println(nextNumberPrinter);
        nextNumberPrinter += 1;
    }
}
