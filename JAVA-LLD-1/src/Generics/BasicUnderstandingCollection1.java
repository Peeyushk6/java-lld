package Generics;

import java.util.ArrayList;
import java.util.List;

class Student2{
    String name;
    int id;

    Student2(int id ,String name){
    this.id = id;
    this.name = name;
    }

//    @Override
//    public String toString() {
//        return "id=" + id + ", name=" + name;
//    }
}
public class BasicUnderstandingCollection1 {

    public static void main(String[] args) {
        List<Student2> al = new ArrayList<>();

        al.add(new Student2(1,"abc"));
        al.add((new Student2(2,"ewr")));

        Student2 s1 = al.get(0);
        Student2 s2 = al.get(1);
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s2.id);
        System.out.println(s2.name);
        System.out.println(al.get(0));
        System.out.println(al.get(1)); //Reference to Student2 object

//        🔍 What is this?
//                ClassName@hexadecimalHashCode
//        Student2 → class name
//        1a2b3c → hashcode (not actual memory address)
//🔥 Important:
//
//        Java does NOT show real memory address
//        It shows hashCode representation

//        ✅ Why this happens?
//
//                Because default toString() is:
//
//        return getClass().getName() + "@" + Integer.toHexString(hashCode());

    }

}
