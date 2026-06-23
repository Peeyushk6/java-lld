package Synchronization;

class Counter5 {
    static  int count =0;
    static synchronized void increment(){
        count++;
    }
}
public class StaticSynchronization {

    public static void main(String[] args) throws Exception{

        Thread t1 = new Thread(()-> {
            for (int i = 0; i <2500; i++) {
                Counter5.increment();
            }
        });

        Thread t2 = new Thread(() ->{
           for (int i=0 ; i<22600 ; i++){
               Counter5.increment();
           }
        });

        t1.start();
        t2.start();

        t1.join();
        System.out.println(Counter5.count);

//        t2.join();
        System.out.println(Counter5.count);

        System.out.println("---------------------");

        System.out.println(Counter5.count);
    }

}
