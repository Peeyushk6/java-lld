package Protoype_AND_Registry.Solution;

public class RegistryMain {
    static void main() {
        StudentRegistry registry = new StudentRegistry();
        //Register Prototype 1
        IntelligentStudent intelligentPrototype = new IntelligentStudent("Peeyush",25,100);
        registry.register("INTELLIGENT",intelligentPrototype);

        //Register Prototype 2
        GeniusStudent geniusPrototype = new GeniusStudent("Einstien",30,1);;
        registry.register("GENIUS",geniusPrototype);

        //Fetch Clone 1
        Student student1 = registry.get("INTELLIGENT");

        //Fetch Clone 2
        Student student2 = registry.get("INTELLIGENT");

        System.out.println(student1.age);
        System.out.println(student2);

        //Fetch Clone 3
        Student student3 = registry.get("GENIUS");

        //Fetch Clone 4
        Student student4 = registry.get("GENIUS");

        System.out.println();

        System.out.println("student1 == student2 : " + (student1 == student2));

        System.out.println("student3 == student4 : " + (student3 == student4)
        );

    }


}
