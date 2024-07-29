package hus.oop.lab04.exercises_on_composition.customer_and_account_classes;

public class TestAccount {
    public static void main(String[] args) {
        Customer customer = new Customer(123, "Hoang", 'm');
        System.out.println(customer);

        Account account = new Account(999, customer, 9999.50);
        System.out.println(account);
        account.setBalance(10000.3456);
        System.out.println(account);

        System.out.println("Account's id is: " + account.getID());
        System.out.println("Customer's name is: " + account.getCustomerName());
        System.out.println("Account's balance is: " + account.getBalance());
        account.deposit(50);
        System.out.println("Account received 50$, new account's balance is: " + account.getBalance());
        account.withdraw(11);
        System.out.println("Account withdrawn 11$, new account's balance is: " + account.getBalance());
        account.withdraw(10000000); // Error!
    }
}
