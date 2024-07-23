package hus.oop.lab04.exercises_on_classes.employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1);

        employee1.setSalary(999);
        System.out.println(employee1);
        System.out.println("Id is: " + employee1.getId());
        System.out.println("Name is: " + employee1.getName());
        System.out.println("Salary is: " + employee1.getSalary());
        System.out.println("Annual salary is: " + employee1.getAnnualSalary(employee1.getSalary()));
        System.out.println("Salary after raised: " + employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
