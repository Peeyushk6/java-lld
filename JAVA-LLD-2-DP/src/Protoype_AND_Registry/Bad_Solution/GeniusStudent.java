package Protoype_AND_Registry.Bad_Solution;

public class GeniusStudent extends Student{
    protected int rank;

    public GeniusStudent(){}

    public GeniusStudent(GeniusStudent other){
        super(other);
        this.rank = other.rank;
    }
}
