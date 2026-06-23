package Protoype_AND_Registry.Solution;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(String name, int age, int iq){
        super(name,age);
        this.iq = iq;
    }

    //Copy Constructor
    public IntelligentStudent(IntelligentStudent other){
        super(other);
        this.iq = other.iq;
    }

    @Override
    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

    @Override
    public String toString() {
        return "IntelligentStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                '}';
    }
}
