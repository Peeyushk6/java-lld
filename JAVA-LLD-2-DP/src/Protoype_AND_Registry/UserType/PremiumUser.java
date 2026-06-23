package Protoype_AND_Registry.UserType;

public class PremiumUser extends User {
    private double subscriptionAmount;

    public PremiumUser(String name, String email, double subscriptionAmount){
        super(name,email);
        this.subscriptionAmount = subscriptionAmount;
    }

    public PremiumUser(PremiumUser other){
        super(other);
        this.subscriptionAmount = other.subscriptionAmount;
    }

    @Override
    public PremiumUser clone() {
        return new PremiumUser(this);
    }


    @Override
    public String toString() {
        return "GuestUser :- email"+this.email +" name :- "+this.name+"subscriptionAmount :- "+this.subscriptionAmount;
    }
}
