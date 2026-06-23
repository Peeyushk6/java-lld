package threads.mutlithreadedhelloworld;

public class HelloWorldPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World 1 " + Thread.currentThread().getName());
        System.out.println("Hello World 2" + Thread.currentThread().getName());
        blabla();
        clabla();
    }


    private void blabla() {
        System.out.println("blabla" + Thread.currentThread().getName());
        System.out.println("Bla Bla");
    }

    private void clabla() {
        System.out.println("clabla" + Thread.currentThread().getName());
        System.out.println("Cla Cla");
    }
}
