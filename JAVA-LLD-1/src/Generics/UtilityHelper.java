package Generics;

class UtilityHelper {

    public static <T> void printArray(T[] arr){
        for (T item: arr){
            System.out.println(item + " ");
        }
    }

    public static <T> T getFirst(T[] arr){
        return arr[0];
    }
}

class Main{
    public static void main(String[] args) {
        Integer[] nums = {1,2,3};
        String[] words = {"Hello", "World"};

        UtilityHelper.printArray(nums);
        UtilityHelper.printArray(words);

        System.out.println(UtilityHelper.getFirst(words));
    }
}

//🔴 Short Answer
//
//We use Integer instead of int because:
//
//        👉 Java generics only work with objects, not primitive types
//
//🧠 Why Generics Don’t Support int
//
//Your generic method is:
//
//public static <T> void printArray(T[] arr)
//
//Here T means:
//
//        “Any reference type (object)”
//
//But:
//
//int ❌ → primitive (not an object)
//Integer ✅ → class (object)
//
//So this will NOT work:
//
//int[] nums = {1,2,3};
//UtilityHelper.printArray(nums); // ❌ compile error
//🧩 What is Integer then?
//
//Integer is a wrapper class for int.
//
//Java provides wrapper classes for all primitives:
//
//Primitive	Wrapper Class
//int	Integer
//double	Double
//char	Character
//boolean	Boolean
//⚙️ Behind the scenes (Important)
//
//Java generics use type erasure.
//
//At runtime:
//
//<T>
//
//becomes:
//
//Object
//
//So your method internally behaves like:
//
//public static void printArray(Object[] arr)
//
//Now think:
//
//        👉 Can int[] be treated as Object[]?
//        ❌ No — primitives are not objects
//
//👉 Can Integer[] be treated as Object[]?
//        ✅ Yes
//
//🔁 Autoboxing (Why your code feels easy)
//
//Java automatically converts:
//
//int → Integer
//
//Example:
//
//Integer[] nums = {1,2,3};
//
//Internally becomes:
//
//Integer[] nums = {Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(3)};
//
//This is called autoboxing.
//
//        🔥 Key Interview Point
//
//If interviewer asks:
//
//Why generics don't support primitives?
//
//Answer:
//
//Generics are implemented using type erasure
//They work only with reference types
//Supporting primitives would require separate implementations for each primitive, breaking Java’s design simplicity
//🧪 Small Mental Model
//
//Think of generics like:
//
//Box<T>
//
//You can put:
//
//Box<String> ✅
//Box<Integer> ✅
//Box<int> ❌ (not allowed)
//        ✅ Final Takeaway
//
//👉 Always remember:
//
//Generics = Objects only → use wrapper classes