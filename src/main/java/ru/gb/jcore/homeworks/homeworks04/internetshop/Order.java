package ru.gb.jcore.homeworks.homeworks04.internetshop;

public class Order {
private Customer customer;
private Product product;
private int amount;

    public Order(Customer customer, Product product, int amount) {
        this.customer = customer;
        this.product = product;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Заказ{" +
                "покупатель=" + customer +
                ", товар=" + product +
                ", количество=" + amount +
                '}';
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Product getProduct() {
        return product;
    }

    public int getAmount() {
        return amount;
    }
}
