package Synchronization;

import java.util.concurrent.atomic.AtomicInteger;

class Counter7 {
    AtomicInteger count = new AtomicInteger(0);

    void increment(){
        count.incrementAndGet();
    }
}

public class Atomic {
    public static void main(String[] args) throws Exception {
        Counter7 counter = new Counter7();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 200; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(() ->{
            for (int i = 0; i < 300; i++) {
                counter.increment();

            }
        });

        t1.start();

        t1.join();

        t2.start();

        t2.join();
        System.out.println(counter.count);
    }
}
