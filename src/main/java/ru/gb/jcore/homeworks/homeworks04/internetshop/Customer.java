package ru.gb.jcore.homeworks.homeworks04.internetshop;

public class Customer {
    private String name;

    public String getName() {
        return name;
    }

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Покупатель{" +
                "имя='" + name + '\'' +
                '}';
    }
}
