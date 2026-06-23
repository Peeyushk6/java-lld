package Protoype_AND_Registry.Bad_Solution;

public class Student {
    protected String name;
    protected int age;

    public Student(){}

    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
    }
}


