package String_Object;

import java.util.HashSet;
import java.util.Set;

class Student4{
    int id;

    Student4(int id){
        this.id = id;
    }


    @Override
    public boolean equals(Object obj){
        Student s = (Student) obj;
        return  this.id == s.id;
    }

//    @Override
//    public String toString(){
//        return "Student{id=" + id + "}";
//    }
}

public class EqualsHashCode {
    public static void main(String[] args) {
        Set<Student4> set = new HashSet<>();

        set.add(new Student4(1));
        set.add(new Student4(1));

        System.out.println(set.size());

        Student4 s = new Student4(1);
        System.out.println(s); //s.toString() is called automatically output = Student{id=1} if not overridden
        //If toString is not overridden output is -> String_Object.Student4@5b480cf9
    }
}
