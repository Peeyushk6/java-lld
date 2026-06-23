package Synchronization;

import org.w3c.dom.css.Counter;

class Counter10{
    int count = 0;

    synchronized void add(){
        count++;
    }

    synchronized void substract(){
        count--;
    }
}

class Substractor1 extends Thread{
    Counter10 counter;

    Substractor1(Counter10 c){
        this.counter = c;
    }

    public void run(){
        for (int i = 0; i< 10000; i++) {
            counter.substract();
        }
    }
}

class Adder1 extends Thread{
    Counter10 counter;
    Adder1(Counter10 c){
        this.counter = c;
    }
    public void run(){
        for (int i = 0; i < 10000; i++) {
            counter.add();
        }
    }
}
public class AdderSubstractorPblm  {
    public static void main(String[] args) throws Exception {
        Counter10 counter = new Counter10();
//        Counter10 counter1 = new Counter10();
        Adder1 adder = new Adder1(counter);
        Substractor1 substract = new Substractor1(counter);

        adder.start();
        substract.start();

        adder.join();
        substract.join();

        System.out.println(counter.count);
    }
}



//Think like this:
//Counter10 object
//        |
//           |--- count
//   |--- lock
//
//Lock belongs to the object, not the variable
//Lock only works for code that tries to acquire the SAME lock

//Lock is not "protecting the variable"
//Lock is only controlling threads that respect the lock
// For instance methods, synchronized locks the current object (this).
//For static methods, it locks the class object (ClassName.class).
//It does not lock variables
//
//


//1️⃣ Your Scenario
//
//You are saying:
//
//Counter10 c1 = new Counter10();
//Counter10 c2 = new Counter10();
//
//Threads:
//
//t1 → uses c1 (add)
//t2 → uses c2 (subtract)
//2️⃣ What Happens Here
//
//Each object has its own:
//
//        ✔ count variable
//✔ lock (monitor)
//
//So internally:
//
//c1 → count1, lock1
//c2 → count2, lock2
//3️⃣ Execution Flow
//Thread1
//c1.add();
//
//Updates:
//
//c1.count++
//Thread2
//c2.subtract();
//
//Updates:
//
//c2.count--
//        4️⃣ Final Output
//
//After both threads finish:
//
//c1.count = 10000
//c2.count = -10000
//
//Because:
//
//Thread1 → only modifies c1
//Thread2 → only modifies c2
//5️⃣ Key Insight
//
//You said:
//
//count variable is independent for both objects
//
//✅ 100% correct
//
//Each object has its own separate copy of:
//
//count
//6️⃣ Important Clarification
//
//You also said:
//
//completely different flow
//
//Let’s refine that:
//
//        ✔ Execution is independent
//✔ Data is independent
//✔ Locks are independent
//
//So:
//
//NO race condition
//NO interference
//7️⃣ Why No Synchronization Problem Here
//
//Because:
//
//No shared resource
//
//Rule:
//
//Synchronization is needed ONLY when multiple threads share the same data
//
//Here:
//
//Thread1 → c1.count
//Thread2 → c2.count
//
//Different memory locations → no problem.
//
//        8️⃣ Visualization
//Object c1:
//count = 10000
//lock = L1
//
//Object c2:
//count = -10000
//lock = L2
//
//Threads:
//
//Thread1 → works on c1
//Thread2 → works on c2
//
//No overlap.
//
//        9️⃣ Important Interview Twist ⚠️
//
//Interviewer may trick you:
//
//Counter10 c1 = new Counter10();
//Counter10 c2 = new Counter10();
//
//t1 → c1.add()
//t2 → c2.add()
//
//Question:
//
//Will synchronization block each other?
//
//Answer:
//
//NO
//
//Because:
//
//lock(c1) ≠ lock(c2)
//🔟 Golden Rule (VERY IMPORTANT)
//
//👉 Synchronization works per object
//
//same object → blocking happens
//different objects → no blocking
//1️⃣1️⃣ One-Line Interview Answer
//
//Each object has its own instance variables and its own monitor lock. If threads operate on different objects, there is no shared resource and hence no synchronization issue.
//
//✅ Final Conclusion
//
//Your understanding (clean version):
//
//        ✔ Two objects → two separate count variables
//✔ Threads operate independently
//✔ No race condition
//✔ No need for synchronization
//✔ Results are independent
//
//🔥 You’re now understanding object-level locking, which is a very strong concept.