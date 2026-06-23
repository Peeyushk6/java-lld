package Protoype_AND_Registry.Solution;

public class Main {
    static void main() {
        //Original object
        IntelligentStudent original =
                new IntelligentStudent("Peeyush",25,140);


        //Clone
        IntelligentStudent copy = original.clone();
        System.out.println(original);
        System.out.println(copy);

        System.out.println(original);

        System.out.println(copy);

        System.out.println("Same Object? "+
                (original == copy));
    }
}
