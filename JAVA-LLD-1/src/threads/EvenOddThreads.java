package threads;

class EvenPrinter implements Runnable{
    public void run(){
        for(int i=2 ; i<=2000 ; i +=2){
            System.out.println(i);
        }
    }
}

class OddPrinter implements Runnable{
    public void run(){
        for (int i=1; i<2000; i += 2){
            System.out.println(i);
        }
    }
}
public class EvenOddThreads {
    public static void main(String[] args) {

        Thread t1 = new Thread(new EvenPrinter());
        Thread t2 = new Thread(new OddPrinter());

        t1.start();
        t2.start();
    }
}
