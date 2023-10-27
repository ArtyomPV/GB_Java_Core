package ru.gb.jcore.homeworks.homeworks03;

import java.time.LocalDate;

public class Employee extends Person {
    private String position;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

    public Employee(String name, String middleName, String surName, LocalDate birthday, String position, int salary) {
        super(name, middleName, surName, birthday);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format(super.toString() +
                ", position='" + this.getPosition() + '\'' +
                ", salary= " + this.getSalary());
    }
}
