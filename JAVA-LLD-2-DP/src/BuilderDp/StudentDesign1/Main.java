package BuilderDp.StudentDesign1;

public class Main {

    static void main() {
        Student s = new Student.Builder()
                .setName("Peeyush Kumar")
                .setAge(23)
                .setPsp(89.32)
                .setEmail("subhamsingh@gmail.com")
                .build();

        System.out.println("Student Created "+ s.getName());
    }
}
