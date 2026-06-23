package Protoype_AND_Registry.UserType;

import java.util.HashMap;

public class UserRegistry {
    private final HashMap<String,User> registry = new HashMap<>();

    public void register(String key, User user){
        registry.put(key,user);
    }

    public User get(String key){
        User prototype = registry.get(key);
        if(prototype == null){
            throw new IllegalArgumentException("Prototype not found");
        }
        return prototype.clone();
    }
}
