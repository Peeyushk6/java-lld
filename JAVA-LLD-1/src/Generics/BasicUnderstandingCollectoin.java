package Generics;

import java.util.*;

class Student{
    String name;
    int age;

    Student(String name, int age){
        this.name = name;
        this.age = age;
    }
}

class Student1{
    String name;
    int age;

    Student1(String name, int age){
        this.name = name;
        this.age = age;
    }
}

public class BasicUnderstandingCollectoin {
    public static void main(String[] args) {

        List list = new ArrayList();

        list.add(new Student("Peeyush",45));
        list.add(new Student("Rahul",46));

        Object obj = list.get(0);

//        Student1 s = (Student1) obj; // Runtime error not compile time because Because compiler does NOT know actual object type at runtime
        Student s = (Student) obj; // manual casting



        System.out.println(s.name);
        System.out.println(s.age);




    }
}
