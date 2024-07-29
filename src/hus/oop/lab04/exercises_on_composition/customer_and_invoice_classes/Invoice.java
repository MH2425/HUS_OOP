package hus.oop.lab04.exercises_on_composition.customer_and_invoice_classes;

public class Invoice {
    private int id;
    private Customer customer;
    private double amount;

    public Invoice(int id, Customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getCustomerID() {
        return this.getCustomer().getID();
    }

    public String getCustomerName() {
        return this.getCustomer().getName();
    }

    public int getCustomerDiscount() {
        return this.getCustomer().getDiscount();
    }

    public double getAmountAfterDiscount() {
        return this.amount * (100.0 - getCustomerDiscount()) / 100.0;
    }

    @Override
    public String toString() {
        return "Invoice[id = " + this.id
                + ", customer =" + customer.toString()
                + ", amount = " + this.amount
                + "]";
    }
}
