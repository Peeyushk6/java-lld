package BuilderDp.StudentDesign2_git;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String univName;
    private String batchName;
    private long id;
    private int gradYear;
    private String phoneNo;

    public  Student (StudentBuilder input){
        this.name = input.name;
        this.age = input.age;
        this.id = input.id;
        this.phoneNo = input.phoneNo;
    }

    public static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }


     public static class StudentBuilder{
        String name;
        int age;
        double psp;
        String univName;
        String batchName;
        long id;
        int gradYear;
        String phoneNo;

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public StudentBuilder setUnivName(String univName) {
            this.univName = univName;
            return this;
        }

        public StudentBuilder setBatchName(String batchName) {
            this.batchName = batchName;
            return this;
        }

        public StudentBuilder setId(long id) {
            this.id = id;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }


         //Part of StudentBuilder Class.
         //this :: StudentBuilder

         public Student build() throws Exception {
             //Add all validations here.....
             if(this.age<18){
                 throw new Exception("Age is less than 18....");
             }
             // return this; ---> StudentBuilder()

             return new Student(this);
         }
    }
}

