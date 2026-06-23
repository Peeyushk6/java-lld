package Synchronization;

class A{}

class B{}

public class DeadLock {

    public static void main(String[] args) {

        A a = new A();
        B b = new B();

//        Thread1 → waiting for B
//        Thread2 → waiting for A

//        Since each thread holds a lock the other needs,
//                both threads wait indefinitely causing a deadlock.

        Thread t1 = new Thread(() -> {
            synchronized (a){
                System.out.println("Thread 1 locked A");

                synchronized (b){ // dead lock happened
                    System.out.println("Thread 1 locked B");
                }
            }
        });

        //Deadlock only happens when another thread locks them in opposite order.
        Thread t2 = new Thread(() -> {
            synchronized (b){
                System.out.println("Thread 2 locked B");

                synchronized (a){
                    System.out.println("Thread 2 locked A");
                }
            }
        });

        t1.start();
        t2.start();
    }
}


/*
4️⃣ Step-by-Step Deadlock Scenario
Initial:

lock(A) = free
lock(B) = free
Step 1

Thread1 runs first.

Thread1 locks A

State:

A → Thread1
B → free
Step 2

Thread2 runs.

Thread2 locks B

State:

A → Thread1
B → Thread2
Step 3

Thread1 tries:

synchronized(b)

But b is already locked by Thread2.

        So:

Thread1 WAITING for B
Step 4

Thread2 tries:

synchronized(a)

But a is already locked by Thread1.

        So:

Thread2 WAITING for A
5️⃣ Final State
Thread1 → waiting for B
Thread2 → waiting for A

Neither can continue.

This is deadlock.*/
