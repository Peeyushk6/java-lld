package OrderManagementSystemGeneric;

import java.util.*;
import java.util.stream.Collectors;

public class User implements Comparable<User>{
    private String name;
    private int age;
    private double salary;

    public User(String name, int age , double salary){
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    public int getAge(){
        return  age;
    }

    public double getSalary() {
        return salary;
    }

    public String getName(){
        return name;
    }

    @Override
    public int compareTo(User other){
        return Integer.compare(this.age, other.age); // sort by age
    }

    @Override
    public String toString(){
        return name+ " | Age: " + age + " | Salary " + salary;
    }
}

class Main{
    static void main() {

        Repository<User> repo = new Repository<>();

        repo.add(new User("Peeyush", 25, 50000));
        repo.add(new User("Aman", 30, 70000));
        repo.add(new User("Rohit", 22, 40000));
        repo.add(new User("Neha", 28, 80000));

        // Filter users with salary > 50k
        List<User> highSalaryUsers = repo.filter(u -> u.getSalary()>50000);
        System.out.println("High Salary Users:");
        highSalaryUsers.forEach(System.out::println);
        System.out.println("-------------------------------------");

        // Sort users by age
//        List<User> sorttedUsers = new ArrayList<>(repo.getAll()); // New ArrayList is created ,Objects inside are still SAME references
//        Collections.sort(sorttedUsers);
//        sorttedUsers.forEach(System.out::println);

//        List<User> deepCopy = repo.getAll().stream()
//                .map(u -> new User(u.getName(), u.getAge(), u.getSalary()))
//                .toList();

        //Modern Way
        repo.getAll().sort(null);
        repo.getAll().forEach(System.out::println);

        //3 Stream: Get names of users age > 25
        List<String> names = repo.getAll().stream()
                .filter(u -> u.getAge() > 25)
                .map(User :: getName)
                .collect(Collectors.toList());

        System.out.println("\nNames (Age>25): " + names);

        //4. Average Salary
        double avgSalary = repo.getAll().stream()
                .mapToDouble(User::getSalary)
                .average()
                .orElse(0);

        System.out.println("\nAverageSalary: "+ avgSalary);

        // 5. Max Salary User
        repo.getAll().stream()
                .max(Comparator.comparing(User::getSalary))
                .ifPresent(u -> System.out.println("\nHighest Paid: " + u));


    }
}


