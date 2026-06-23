package Protoype_AND_Registry.UserType;

public class GuestUser extends User{
    private int expiryDays;

    public GuestUser(String name, String email, int expiryDays){
        super(name, email);
        this.expiryDays = expiryDays;
    }
    public GuestUser(GuestUser other){
        super(other);
        this.expiryDays = other.expiryDays;
    }

    @Override
    public GuestUser clone() {
        return new GuestUser(this);
    }

    @Override
    public String toString() {
        return "GuestUser :- email"+this.email +" name:- "+this.name+"expiryDays :- "+this.expiryDays;
    }
}
