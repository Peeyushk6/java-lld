package Synchronization;

class Counter3 implements Runnable{
    int count = 0;

    public synchronized void increment(){
        count++;
    }

    public void run(){
        for (int i=0 ; i<10000 ; i++){
            increment();
        }
    }
}

public class BaseMethodSyncLambda {

    public static void main(String[] args) throws Exception{
        Counter3 counter = new Counter3();

        Thread t1 = new Thread(counter);
        Thread t2 = new Thread(counter);

        t1.start();
        t2.start();

        t1.join();//Main thread waits for the thread to finish
        t2.join();
        System.out.println(counter.count);
    }
}
