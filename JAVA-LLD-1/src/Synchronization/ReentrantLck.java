package Synchronization;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter6 {
    int count = 0;

    Lock lock = new ReentrantLock();

    void increment(){
        lock.lock();
        count++;
        lock.unlock();
    }
}
public class ReentrantLck {
    public static void main(String[] args) throws Exception{
        Counter6 reent = new Counter6();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 1000; i++) {
                reent.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for (int i = 0; i < 11000; i++) {
                reent.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(reent.count);

    }
}
