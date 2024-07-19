package hus.oop.lab01.lab04.exercises_on_classes.employee;

public class Employee {
    private final int id;
    private final String firstName;
    private final String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary(int salary) {
        return this.salary * 12;
    }

    public int raiseSalary(int percent) {
        return this.salary + this.salary * percent;
    }

    @Override
    public String toString() {
        return "Employee[id = " + this.id + ", name = " + getName()
                + ", salary = " + this.salary + "]";
    }
}
