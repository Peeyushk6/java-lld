package Generics;

class Calculator < T extends Number>{
//    public double square(T value){
//        return value.doubleValue()*value.doubleValue();
//    }
    public int square(T value){
        return value.intValue()*value.intValue();
    }
}
public class BoundedGenerics {
    public static void main(String[]args){
        Calculator<Integer> calc1 = new Calculator<>();
        Calculator<Double> calc2 = new Calculator<>();

        System.out.println(calc1.square(3));
        System.out.println(calc2.square((2.5)));
    }
}
//
//
//You’re very close to understanding one of the most important patterns in Java generics. Let’s break it cleanly.
//
//        🔴 Your Core Question
//
//Why can’t we do value * value directly?
//And how does this work for both int and double?
//
//        ❌ Why value * value DOES NOT WORK
//
//Inside your generic class:
//
//class Calculator<T extends Number>
//
//T is not a concrete type, it's just:
//
//        “Some class that extends Number”
//
//So when you write:
//
//value * value
//
//👉 Compiler thinks:
//
//        “What is T?”
//        “Does T support * operator?”
//
//        💥 Problem:
//
//Java operators (+, *, -) work only on primitives
//T is always an object (reference type)
//
//So this is illegal:
//
//        return value * value; // ❌ compile error
//✅ Why value.doubleValue() WORKS
//
//Because of this:
//
//T extends Number
//
//You are guaranteed that:
//
//        👉 value has methods from Number class:
//
//intValue()
//doubleValue()
//floatValue()
//etc.
//
//        So this works:
//
//        return value.doubleValue() * value.doubleValue();
//
//Now both sides become:
//
//double * double  // ✅ valid
//🔁 How it handles both int and double
//Case 1: Integer
//calc1.square(5);
//
//Behind the scenes:
//
//        5 → Integer.valueOf(5)   // autoboxing
//
//Then:
//
//value.doubleValue() → 5.0
//
//So:
//
//        5.0 * 5.0 = 25.0
//Case 2: Double
//calc2.square(2.5);
//
//Already:
//
//        2.5 → Double object
//
//Then:
//
//value.doubleValue() → 2.5
//
//So:
//
//        2.5 * 2.5 = 6.25
//        🧠 Key Insight (VERY IMPORTANT)
//
//Generics + Math = Always convert to primitive first
//
//🔥 Interview Insight
//
//If asked:
//
//Why prefer doubleValue() over intValue()?
//
//Answer:
//
//intValue() truncates decimals → data loss
//doubleValue() preserves precision
//More generic-safe for all Number types
//✅ Final Summary
//Approach	Output	Problem
//intValue()	9.0 (because return type is double)	❌ loses decimals
//doubleValue()	6.25, 9.0	✅ correct
//return type = int	9	❌ not safe for Double
//
//Because:
//
//Generics deal with objects
//Math operators need primitives
//🔥 Interview-Level Understanding
//
//If interviewer asks:
//
//How do you perform arithmetic on generic types?
//
//Answer:
//
//        👉 You restrict type using:
//
//<T extends Number>
//
//👉 Then convert using:
//
//value.doubleValue()
//⚠️ Subtle Limitation
//
//This approach:
//
//        return value.doubleValue() * value.doubleValue();
//
//👉 Always returns double
//
//Even if input was Integer
//
//So:
//
//square(5) → 25.0  // not 25
//        🚀 If you want more control (advanced idea)
//
//You could overload instead:
//
//public int square(int x) { return x * x; }
//public double square(double x) { return x * x; }
//
//👉 But then you lose generic flexibility
//
//✅ Final Takeaway
//❌ value * value → not allowed (object)
//✅ value.doubleValue() → converts to primitive
//🔁 Works for all Number types (Integer, Double, etc.)
//⚠️ Result always becomes double
//
//
//🔴 What you wrote
//return value.intValue() * value.intValue();
//
//Let’s break it:
//
//Step 1: What is the expression type?
//value.intValue() → int
//
//So:
//
//int * int → int
//
//👉 The result of the multiplication is int
//
//🟡 Then why are you seeing 9.0, 4.0?
//
//Because your method is:
//
//public double square(T value)
//
//👉 So Java does this automatically:
//
//int → double   (implicit widening)