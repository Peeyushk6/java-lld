package Synchronization;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

 class ProducerConsumerCode {

    Queue<Integer> buffer = new LinkedList<>();

    int capacity = 5;

    Semaphore empty = new Semaphore(capacity);

    Semaphore full = new Semaphore(0);

    Semaphore mutex = new Semaphore(1);

    public void produce(int item) throws InterruptedException{
        empty.acquire(); // wait for empty slot - producer should NOT add if buffer is full ->// wait if buffer is full
        mutex.acquire(); // enter critical section - Multiple threads should NOT modify buffer at same time -> lock

        buffer.add(item);
        System.out.println("Produced: "+ item);

        mutex.release(); // leave critical section -> unlock
        full.release(); // signal consumer -> Item available
    }

    public void consume() throws InterruptedException{
        full.acquire(); // wait for item; - Consumer should NOT remove if buffer is empty
        mutex.acquire(); // enter critical Section - Multiple threads should NOT modify buffer at same time

        int item = buffer.remove();
        System.out.println("Consumed: "+ item);

        mutex.release(); // leave critical section
        empty.release(); // signal producer

    }
}

public  class ProducerConsumer{
    public static void main(String[] args) {
        ProducerConsumerCode pc = new ProducerConsumerCode();

        Thread producer = new Thread(() ->{
            for (int i = 20; i <= 25; i++) {
                try{
                    pc.produce(i);
                } catch (Exception e) {

                }

            }
        });

        Thread consumer = new Thread(() -> {
            for (int i = 1; i <=10; i++) {
                try{
                    pc.consume();
                }
                catch (Exception e){}
            }
        });

        producer.start();
        consumer.start();
    }
}

