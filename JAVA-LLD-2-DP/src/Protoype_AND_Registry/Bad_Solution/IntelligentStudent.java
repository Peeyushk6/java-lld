package Protoype_AND_Registry.Bad_Solution;

public class IntelligentStudent extends Student{
    protected int iq;
    public IntelligentStudent(){}
    public IntelligentStudent(IntelligentStudent other){
        super(other);
        this.iq = other.iq;
    }
}
