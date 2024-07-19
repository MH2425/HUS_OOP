package hus.oop.lab01.lab04.exercises_on_classes.account;

public class Account {
    private final String id;
    private final String name;
    private int balance;

    public Account(String id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0;
    }

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount) {
        return this.balance += amount;
    }

    public int debit(int amount) {
        if (amount <= balance) {
            return this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Amount exceed balance");
        }
    }

    public int transferTo(Account another, int amount) {
        if (amount <= balance) {
            another.credit(amount);
            return this.balance -= amount;
        } else {
            throw new IllegalArgumentException("Amount exceed balance");
        }
    }

    @Override
    public String toString() {
        return "Account[id = " + this.id + ", name = " + this.name + ", balance = " + this.balance + "]";
    }
}
