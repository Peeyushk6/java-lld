package Synchronization;

class Counter9 {
    int count = 0;

    void add(){
        count++;
    }

    void substract(){
        count--;
    }
}

class Adder extends Thread{
    Counter9 counter;

    Adder(Counter9 c){
        counter = c;
    }

    public void run(){
        for (int i = 0; i < 10000; i++) {
            counter.add();
        }
    }
}

class Substractor extends Thread{
    Counter9 counter;

    Substractor(Counter9 c){
        counter = c;
    }

    public void run(){
        for (int i = 0; i < 10000; i++) {
            counter.substract();
        }
    }
}


public class AdderSubstractorWithoutSynchronization {
    public static void main(String[] args) throws Exception{
        Counter9 counter = new Counter9();

        Adder adder = new Adder(counter);
        Substractor substract = new Substractor((counter));

        adder.start();
        substract.start();

        adder.join();
        substract.join();
        System.out.println(counter.count);

    }
}
