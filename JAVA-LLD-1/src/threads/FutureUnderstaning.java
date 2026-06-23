package threads;

import java.util.concurrent.*;

class SquareCalculator1 implements Callable<Integer> {

    int number;

    SquareCalculator1(int number){
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {

        System.out.println("Task started by " + Thread.currentThread().getName());

        System.out.println("Calculating square of " + number);

        Thread.sleep(3000); // simulate long computation

        int result = number * number;

        System.out.println("Task finished by " + Thread.currentThread().getName());

        return result;
    }
}

public class FutureUnderstaning {
    public static void main(String[] args) throws Exception {

        System.out.println("Main thread started: " + Thread.currentThread().getName());

        ExecutorService executor = Executors.newFixedThreadPool(2);

        System.out.println("Submitting task...");

        Future<Integer> future = executor.submit(new SquareCalculator1(5));

        System.out.println("Task submitted.");

        System.out.println("Checking if task is done: " + future.isDone());

        System.out.println("Main thread doing other work...");

        Thread.sleep(1000);

        System.out.println("Checking again if task is done: " + future.isDone());

        System.out.println("Now calling future.get() (this may block)");

        Integer result = future.get();

        System.out.println("Result received from Future: " + result);

        System.out.println("Checking again if task is done: " + future.isDone());

        executor.shutdown();

        System.out.println("Main thread finished");
    }
}
