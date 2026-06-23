package String_Object;


class Student1{
    int id;

    Student1(int id){
        this.id = id;
    }
}

public class HashCode {
    public static void main(String[] args) {

        Student1 s = new Student1(1);


        System.out.println(s.hashCode());
    }
}
