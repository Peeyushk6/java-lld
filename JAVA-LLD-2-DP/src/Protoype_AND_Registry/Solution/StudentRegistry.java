package Protoype_AND_Registry.Solution;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private final Map<String, Student> registry =
            new HashMap<>();

    public void register(String key, Student student){
        registry.put(key,student);
    }

    public Student get(String key){
        Student prototype = registry.get(key);
        if(prototype == null){
            throw new RuntimeException("Prototype not found");
        }
        return prototype.clone();
    }
}
