package Protoype_AND_Registry.Bad_Solution;

public class Main {

    public static Student copyStudent(Student orignal){

        if(orignal instanceof IntelligentStudent){
            return new IntelligentStudent((IntelligentStudent) orignal);
        } else if (orignal instanceof GeniusStudent) {
            return new GeniusStudent((GeniusStudent) orignal);
        }
        else
        return new Student(orignal);
    }
    static void main() {
        IntelligentStudent s1 = new IntelligentStudent();
        s1.name = "Peeyush";
        s1.age = 21;
        s1.iq = 140;

        Student copy = copyStudent(s1);
        System.out.println(copy != s1);

    }
}
