package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MaxTask implements Callable<Integer> {
    int [] arr;
    int start;
    int end;

    MaxTask(int [] arr, int start, int end){
        this.arr = arr;
        this.start = start;
        this.end = end;
    }
    public Integer call(){
        int max = arr[start];
        for(int i=start; i<end ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

}
public class MaxNumber {
    public static void main(String[] args) throws Exception {

        int [] arr = {4,10,2,89,23,54,90,11};

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<Integer> f1 = executor.submit(new MaxTask(arr,0,2));
        Future<Integer> f2 = executor.submit(new MaxTask(arr,2,4));
        Future<Integer> f3 = executor.submit(new MaxTask(arr,4,6));
        Future<Integer> f4 = executor.submit(new MaxTask(arr,6,8));

        int max = Math.max(
                Math.max(f1.get(), f2.get()),
                Math.max(f3.get(), f4.get())
        ); // We need to compute global max not the the max number total
        System.out.println("Max = " + max);

        executor.shutdown();
    }
}
