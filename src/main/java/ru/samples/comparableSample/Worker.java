package ru.samples.comparableSample;

import java.util.Iterator;

public class Worker implements Comparable<Worker> {
    private String firstName;
    private String lastName;
    private int age;
    private int salary;

    public Worker(String firstName,
                  String lastName,
                  int age,
                  int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("name=%s, lastname=%s, age=%s, salary=%s \n", firstName, lastName, age, salary);
    }

    @Override
    public int compareTo(Worker o) {
//        if (this.age > o.age) return 1;
//        else if (this.age < o.age) return -1;
//        else return 0;

        return Integer.compare(this.age, o.age);
        // если нужно сравнить строки
//        return CharSequence.compare(this.firstName, o.firstName);
    }


//    @Override
//    public int compareTo(Worker o) {
//        if (this.age> o.age)  return 1;
//        if(this.age < o.age) return  -1;
//        return 0;
//    }
}
