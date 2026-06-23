package Synchronization;

class Counter8{
    int count = 0;
    //synchronized is a method modifier, thread lock modifier.
    synchronized void increment(){
        count++;
    }
}
public class MethodSynchronization {
    public static void main(String[] args) throws Exception{
        Counter8 counter = new Counter8();

        Thread t1 = new Thread(()->{
            for(int i=0 ; i<10000 ; i++){
                counter.increment();
            }
        }); // shorter way to implement an interface with one method,
        //Thread t1 = new Thread(() -> counter.increment());
        //So the lambda is just a short form of implementing Runnable.run().

        Thread t2 = new Thread(()->{
            for(int i=0; i<10000 ; i++){
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
