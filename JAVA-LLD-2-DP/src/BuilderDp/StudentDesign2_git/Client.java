package BuilderDp.StudentDesign2_git;

public class Client {
    static void main() throws Exception {
        Student peeyush1 = new Student.StudentBuilder()
                .setAge(22)
                .setBatchName("B1")
                .setId(1223L)
                .setName("Yash")
                .build();

        System.out.println("peeyush1 Object created Successfully "+peeyush1);

        Student peeyush2 = Student.getBuilder()
                .setAge(20)
                .setBatchName("B1")
                .setId(1223L)
                .setName("Yash")
                .build();

        System.out.println("peeyush2 Object created Successfully "+peeyush2);

        System.out.println(peeyush1.equals(peeyush2)); //false

    }
}
