package BuilderDp.StudentDesign1;

public class Student {
    private String name;
    private int age;
    private double psp;
    private String email;

    private Student(Builder builder){
        //Validation
        if(builder.age<18){
            throw new IllegalArgumentException("Age must be >= 18");
        }

        this.name = builder.name;
        this.age = builder.age;
        this.psp = builder.psp;
        this.email = builder.email;
    }
    public String getName() {
        return name;
    }

    public static class Builder{
        private String name;
        private int age;
        private double psp;
        private String email;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }

}
