package threads;

 class HelloPrinter implements Runnable{
    public void run() {
        System.out.println("Hello from " + Thread.currentThread().getName());
    }
}

public class HelloThread5{
    public static void main(String[] args){
        for(int i=0 ; i<5 ; i++){
            Thread t = new Thread(new HelloPrinter());
            t.start();
        }
    }
}
