package ru.samples.comparableSample;

import java.time.LocalDate;
import java.util.Comparator;

public class Client implements Comparator<Client> {
    private String name;
    private LocalDate date;

    public Client(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    @Override
    public int compare(Client o1, Client o2) {
        return o1.getDate().compareTo(o2.getDate());
    }
}
