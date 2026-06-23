package Generics;

import java.util.ArrayList;
import java.util.List;

class GenericRepository <TYPE>{

    List <TYPE> l = new ArrayList<>();

    public void add(TYPE data){
        l.add(data);
    }

    public TYPE get(int index){
        TYPE res = l.get(index);
        return res;
    }

    public List<TYPE> getAll(){
        return l;
    }
}

class User{
    String name;
    User(String name){
        this.name = name;
    }
}

class Product{
    String title;
    Product(String title){
        this.title = title;
    }

    public String toString(){
        return title;
    }
}

class Repository{
    public static void main(String[] args) {
        GenericRepository<User> userType = new GenericRepository<>();
        userType.add(new User("Peeyush"));

        GenericRepository<Product> productType = new GenericRepository<>();
        productType.add(new Product("I will do it."));

        User user = userType.get(0);
        Product product = productType.get(0);

        System.out.println(user.name); // Peeyush
        System.out.println(product.title); // I will do it.

        System.out.println(user); // Generics.User@5b480cf9
        System.out.println(product); // I will do it. (Becasue toString is overriden)
        productType.add(new Product("I have done it."));

        System.out.println(productType.getAll()); // [I will do it., I have done it.]


    }
}
