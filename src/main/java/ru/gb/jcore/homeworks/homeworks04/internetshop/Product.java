package ru.gb.jcore.homeworks.homeworks04.internetshop;

public class Product {
    private String name;
    private int cost;

    public Product(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Товар{" +
                "наименование='" + name + '\'' +
                ", стоимость=" + cost +
                '}';
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
