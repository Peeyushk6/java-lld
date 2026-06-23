package Synchronization;
class Counter4{
    int count = 0;

    void increment(){
        synchronized (this){
            count++;
        }
    }
}
public class SynchronizationBlock {
    public static void main(String[] args) throws Exception{
        Counter4 counter = new Counter4();

        Thread t1 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0 ; i<10000 ; i++){
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
