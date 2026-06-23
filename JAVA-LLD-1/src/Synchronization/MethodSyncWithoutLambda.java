package Synchronization;

class Counter1 {
    int count = 0;

    public synchronized void increment() {
        count++;
    }
}

//| Style            | Code                                     |
//        | ---------------- | ---------------------------------------- |
//        | Separate class   | `class MyTask implements Runnable`       |
//        | Anonymous class  | `new Runnable() { public void run(){} }` |
//        | Lambda (Java 8+) | `() -> {}`                               |


public class MethodSyncWithoutLambda {
    public static void main(String[] args) throws Exception{

        Counter1 counter = new Counter1();


        //it expects an object of a class that implements Runnable. (new Thread)
        //The shortcut: Anonymous Class, Instead of creating a separate class, Java allows you to create a class without a name.
        //an object of an unnamed class that implements Runnable
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<10000 ; i++){
                    counter.increment();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0 ; i<10000 ; i++){
                    counter.increment();
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(counter.count);
    }
}
