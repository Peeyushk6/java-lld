package Synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThreadSleepDemo {
    public static void main(String[] args) {

        try(ExecutorService executer = Executors.newVirtualThreadPerTaskExecutor()){
            for (int i = 1; i <= 1000; i++) {
                int taskId = i;

                executer.submit(()->{
                    System.out.println("Start "+ taskId + " -> " + Thread.currentThread());

                    try{
                        Thread.sleep(2000); // Not blokcing Os thread.
                    }
                    catch (InterruptedException e){

                    }
                });
            }
        }
    }
}
