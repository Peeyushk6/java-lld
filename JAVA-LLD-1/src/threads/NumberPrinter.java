package threads;

public class NumberPrinter {

    public static void main(String[] args) {
        for(int i=0 ; i<=10; i++){
            Thread t = new Thread((new NumberPrinter1(i)));
            t.start();
        }
    }
}

class NumberPrinter1 implements Runnable{
    int number;
    NumberPrinter1(int number){
        this.number = number;
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName()+" : "+ number);
    }

}
