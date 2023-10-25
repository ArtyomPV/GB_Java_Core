package ru.samples.comparableSample;

import java.util.Date;

public class Student implements Comparable<Student>{
    String name;
    Date birthDate;
    public Student(String name, Date birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Student o) {
        return getBirthDate().compareTo(o.getBirthDate());
    }
}
