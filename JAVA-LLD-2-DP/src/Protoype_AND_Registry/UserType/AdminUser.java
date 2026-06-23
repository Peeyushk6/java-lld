package Protoype_AND_Registry.UserType;

public class AdminUser extends User{
    private int accessLevel;

    public AdminUser(String name, String email, int accessLevel){
        super(name, email);
        this.accessLevel = accessLevel;
    }

    public AdminUser(AdminUser other){
        super(other);
        this.accessLevel = other.accessLevel;
    }

    @Override
    public AdminUser clone(){
        return new AdminUser(this);
    }

    @Override
    public String toString() {
        return "AdminUser :- email"+this.email +" name:- "+this.name+"accessLevel :- "+this.accessLevel;
    }
}
