package Synchronization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VirtualThread {

    //Simulating service like API call or DB call
    static class UserService{

        public static String processRequest(int userId){
            try{
                System.out.println("Processing User "+ userId + " on " + Thread.currentThread());
                //Simulate I/O delay (DB/API)
                Thread.sleep(1000);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            return "User " + userId + " Processed";
        }
    }

    public static void main(String[] args) {

        //Virtual Thread Executor
        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()){
            int totalUsers = 20;

            for (int i = 1; i < totalUsers; i++) {
                int userId = i;

                executor.submit(() -> {
                    String result = UserService.processRequest(userId);
                    System.out.println(result);
                });
            }
        } //automatically shuts down
        System.out.println("All tasks submitted");
    }
}
