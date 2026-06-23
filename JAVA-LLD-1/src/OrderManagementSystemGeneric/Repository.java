package OrderManagementSystemGeneric;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Repository <T>{
    private List<T> items = new ArrayList<>();

    public void add(T item){
        items.add(item);
    }

    public List<T> getAll(){
        return items;
    }

    public List<T> filter(java.util.function.Predicate<T> condition){
        return items.stream()
                .filter(condition)
                .collect(Collectors.toList());
    }
}
