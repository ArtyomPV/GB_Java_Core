package ru.samples.comparableSample;

import java.time.LocalDate;

public class Pupil {
    private String name;
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public Pupil(String name, LocalDate date) {
        this.name = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return "Puple{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    //    @Override
//    public int compare(Puple o1, Puple o2) {
//        return o1.getDate().compareTo(o2.getDate());
//    }
}
