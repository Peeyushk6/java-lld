package threads;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class APIRequest implements Runnable{
    int requestId;

    APIRequest(int requestId){
        this.requestId = requestId;
    }

    public void run(){
        try{
            System.out.println("Processing request "+ requestId+"by"+Thread.currentThread().getName());

            Thread.sleep(1000);

            System.out.println("Completed request "+ requestId);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
public class APISimulation {
    public static void main(String[] args) {

        ExecutorService executor = Executors.newFixedThreadPool(10);

        for(int i=0; i<=50 ; i++){
            executor.submit(new APIRequest(i));
        }

        executor.shutdown();
    }
}
