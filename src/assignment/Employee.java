package assignment;

public class Employee {
    private String name;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }
}