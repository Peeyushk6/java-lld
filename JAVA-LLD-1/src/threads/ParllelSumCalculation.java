package threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class sumTask implements Callable<Integer>{
    int start;
    int end;

    sumTask(int start, int end){
        this.start = start;
        this.end = end;
    }

    public Integer call(){
        int sum = 0;
        for(int i=start ; i<=end ; i++){
            sum += i;
        }
        return sum;
    }
}
public class ParllelSumCalculation {
    public static void main(String[] args) throws Exception{
        ExecutorService executor = Executors.newFixedThreadPool(5);

        Future<Integer> f1 = executor.submit(new sumTask(1,200) );
        Future<Integer> f2 = executor.submit(new sumTask(201,400));
        Future<Integer> f3 = executor.submit(new sumTask(401,600));
        Future<Integer> f4 = executor.submit(new sumTask(601,800));
        Future<Integer> f5 = executor.submit(new sumTask(801,1000));

        int total = f1.get()+f2.get()+f3.get()+f4.get()+ f5.get();

        System.out.println("Total Sum = "+total);

        executor.shutdown();
    }
}
