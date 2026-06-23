package threads;

import java.util.concurrent.*;

class SquareCalculator implements Callable<Integer>{
    int number;
    SquareCalculator(int number){
        this.number = number;
    }

    public Integer call() throws Exception {
        Thread.sleep(3000);
        return number*number;
    }
}

public class CallableResult {
    public static void main(String[] args) throws Exception {

        ExecutorService executor = Executors.newFixedThreadPool(3);
        Future<Integer> result = executor.submit(new SquareCalculator(5));
//        while(!result.isDone()){
//            System.out.println("-------------"+result.isDone());
//        }
//        System.out.println("-------------"+result.isDone());
        System.out.println("Result "+ result.get());
        System.out.println("-------------"+result.isDone());

        executor.shutdown();
    }
}
