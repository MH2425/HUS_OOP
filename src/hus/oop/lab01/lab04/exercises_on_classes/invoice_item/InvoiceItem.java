package hus.oop.lab01.lab04.exercises_on_classes.invoice_item;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public String getId() {
        return id;
    }

    public String getDesc() {
        return desc;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotal() {
        return this.qty * this.unitPrice;
    }

    @Override
    public String toString() {
        return "InvoiceItem[id = " + this.id +
                ", desc = " + this.desc +
                ", qty = " + this.qty +
                ", unitPrice = " + this.unitPrice + "]";
    }
}
