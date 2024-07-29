package hus.oop.lab04.exercises_on_composition.customer_and_account_classes;

import java.text.DecimalFormat;

public class Account {
    private int id;
    private Customer customer;
    private double balance;

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
        this.balance = 0.0;
    }

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return Double.parseDouble(String.format("%.2f", this.balance));
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return this.customer.toString() + " balance = $"
                + String.format("%.2f%n", this.balance);
    }

    public String getCustomerName() {
        return this.getCustomer().getName();
    }

    public Account deposit(double amount) {
        this.setBalance(balance + amount);
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount) {
            this.setBalance(balance - amount);
        } else {
            System.out.println("Amount withdrawn exceeds the current balance!");
        }
        return this;
    }
}
