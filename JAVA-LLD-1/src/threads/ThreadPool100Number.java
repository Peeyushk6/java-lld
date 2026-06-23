package threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class NumberPrinter5 implements Runnable{
    int number;

    NumberPrinter5(int number){
        this.number = number;
    }

    public void run(){
        System.out.println("Number printer using thread pool"+Thread.currentThread().getName()+" : "+ number);
    }

}

public class ThreadPool100Number {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);

        for(int i=1 ; i<=100 ; i++){
            executor.submit(new NumberPrinter5(i));
        }

        executor.shutdown();

    }
}
