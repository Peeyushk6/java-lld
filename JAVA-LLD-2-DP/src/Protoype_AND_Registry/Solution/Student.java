package Protoype_AND_Registry.Solution;

public class Student implements Prototype<Student> {
    protected String name;
    protected int age;
    public Student(){}

    //Normal Constructor
    public Student(String name, int age){
        this.name = name;
        this.age=age;
    }

    //Copy Constructor
    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    @Override
    public String toString() {
        return "Student{"+
                "name='" + name + '\''+
                ", age=" + age +
                '}';
    }


}
