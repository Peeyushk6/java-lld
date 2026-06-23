package Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee {
    private String name;
    private int age;
    private String department;
    private double salary;

    public Employee(String name, int age, String department, double salary){
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public String getName(){return name;};
    public int getAge(){return  age;};
    public String getDepartment(){return department;};
    public double getSalary() {return salary;};

    @Override
    public String toString() {
        return name + " | " + age + " | " + salary;
    }
}

class MainLambda{
    static void main() {

        List<Employee> employees = new ArrayList<>(List.of(
                new Employee("Peeyush",25,"IT",50000),
                new Employee("Aman", 30, "HR", 70000),
                new Employee("Rohit", 22, "IT", 40000),
                new Employee("Simran", 26, "IT", 80000),
                new Employee("Neha", 28, "Finance", 80000)

        ));

        //Filter employess in IT department
        List<Employee> itEmployees = employees.stream()
                .filter(e -> e.getDepartment()
                .equals("IT"))
                .toList();

        System.out.println("IT Employees: ");
        itEmployees.forEach(System.out::println);

        //Sort by Salary Desc

        employees.sort(
                Comparator.comparing(Employee::getSalary).reversed()
        );
        System.out.println("\nSorted by Salary DESC");
        employees.forEach(System.out::println);

        //Get names of employees age > 25

        List<String> names = employees.stream()
                .filter(e -> e.getAge() > 25)
                .map(Employee::getName)
                .toList();
        System.out.println("\nNames (Age > 25): "+ names);

        //Average Salary
        double avgSalary = employees.stream().mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("\nAverage Salary: " + avgSalary);

        //Group By department
        Map<String, List<Employee>> grouped = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println("\nGrouped by Department:");
        grouped.forEach((dept,empList) ->{
            System.out.println(dept + " -> " + empList);
        });

        //Highest paid employee
        employees.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .ifPresent(e -> System.out.println("\nHighest Paid: " + e));

        //Multi Level Sorting
        employees.sort(
                Comparator.comparing(Employee::getDepartment)
                        .thenComparing(Employee::getSalary)
        );
        System.out.println("\nSorted by Dept then Salary:");
        employees.forEach(System.out::println);
    }


}
