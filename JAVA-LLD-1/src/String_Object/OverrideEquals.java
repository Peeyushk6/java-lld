package String_Object;

class Student{
    int id;

    Student(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj)
            return true;

        if(obj == null || getClass() != obj.getClass())
            return false;

        Student other = (Student) obj;

        return  this.id == other.id;
    }
}

public class OverrideEquals {
    public static void main(String[] args) {
        Student s1 = new Student(1);
        Student s2 = new Student(1);

        System.out.println(s1.equals(s2));
    }
}
