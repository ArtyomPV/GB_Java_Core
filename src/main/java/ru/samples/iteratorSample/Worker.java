package ru.samples.iteratorSample;

import java.util.Iterator;

public class Worker implements Iterator {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    int index = 0;
    @Override
    public boolean hasNext() {
        return index++ < 4;
    }

    @Override
    public String next() {
        switch(index){
            case 1:
                return String.format("First name %s, ", firstName);
            case 2:
                return String.format("LastName %s, ", lastName);
            case 3:
                return String.format("Age %s, ", age);
            default:
                return String.format("Salary %s, ", salary);
        }

    }
}
