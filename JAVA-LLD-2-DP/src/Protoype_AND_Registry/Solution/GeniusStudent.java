package Protoype_AND_Registry.Solution;

public class GeniusStudent extends Student{
    protected int rank;

    public GeniusStudent(String name,int age, int rank){
        super(name,age);
        this.rank = rank;
    }

    public GeniusStudent(GeniusStudent other){
        super(other);
        this.rank = other.rank;
    }

    @Override
    public GeniusStudent clone() {
        return new GeniusStudent(this);
    }

    @Override
    public String toString() {
        return "GeniusStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rank=" + rank +
                '}';
    }
}
