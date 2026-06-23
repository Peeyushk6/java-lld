package Protoype_AND_Registry.UserType;


public class User implements PrototypeUser<User> {
    protected String name;
    protected String email;

    public User(String name, String email){
        this.name = name;
        this.email=email;
    }

    public User(User other){
        this.name = other.name;
        this.email = other.email;
    }

    @Override
    public User clone() {
        return new User(this);
    }

    @Override
    public String toString() {
        return "User :- email"+this.email +" name:- "+this.name;
    }
}
