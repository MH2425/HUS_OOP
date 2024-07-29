package hus.oop.lab01.exercises_on_input_decision_loop;

import java.util.Scanner;
public class PensionContributionCalculator {
    static Scanner sc = new Scanner(System.in);
    static final int SALARY_CEILING = 6000;
    static final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
    static final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
    static final double EMPLOYEE_RATE_55_TO_60 = 0.13;
    static final double EMPLOYER_RATE_55_TO_60 = 0.13;
    static final double EMPLOYEE_RATE_60_TO_65 = 0.075;
    static final double EMPLOYER_RATE_60_TO_65 = 0.09;
    static final double EMPLOYEE_RATE_65_ABOVE = 0.05;
    static final double EMPLOYER_RATE_65_ABOVE = 0.075;

    public static int inputSalary(Scanner sc) {
        System.out.print("Enter the monthly salary: $");
        int salary = sc.nextInt();
        return salary;
    }

    public static int inputAge(Scanner sc) {
        System.out.print("Enter the age: ");
        int age = sc.nextInt();
        return age;
    }

    public static double computeEmployeeContribution(int salary, int age) {
        int contributableSalary = Math.min(SALARY_CEILING, salary);
        double employeeContribution = 0;
        double employerContribution = 0;
        double totalContribution = 0;
        if (age <= 55) {
            return contributableSalary * EMPLOYEE_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            return contributableSalary * EMPLOYEE_RATE_55_TO_60;
        } else if (age <= 65) {
            return contributableSalary * EMPLOYEE_RATE_60_TO_65;
        } else {
            return contributableSalary * EMPLOYEE_RATE_65_ABOVE;
        }

    }

    public static double computeEmployerContribution(int salary, int age) {
        int contributableSalary = Math.min(SALARY_CEILING, salary);
        if (age <= 55) {
            return contributableSalary * EMPLOYER_RATE_55_AND_BELOW;
        } else if (age <= 60) {
            return contributableSalary * EMPLOYER_RATE_55_TO_60;
        } else if (age <= 65) {
            return contributableSalary * EMPLOYER_RATE_60_TO_65;
        } else {
            return contributableSalary * EMPLOYER_RATE_65_ABOVE;
        }
    }

    public static void printResult(int salary, int age) {
        double employeeContribution = computeEmployeeContribution(salary, age);
        double employerContribution = computeEmployerContribution(salary, age);
        double totalContribution = employeeContribution + employerContribution;
        System.out.printf("The employee's contribution is: $%.2f\n", employeeContribution);
        System.out.printf("The employer's contribution is: $%.2f\n", employerContribution);
        System.out.printf("The total contribution is: $%.2f\n", totalContribution);
    }

    public static void main(String[] args) {
        int salary = inputSalary(sc);
        int age = inputAge(sc);
        sc.close();
        printResult(salary, age);
    }
}
