package ru.gb.jcore.homeworks.homeworks05;

import lombok.*;

import java.util.List;

@Data
@Builder
public class Student {

    private String name;
    private List<Double> grades;
    private String specialty;


//    public Student(String name, List<Double> grades, String specialty) {
//        this.name = name;
//        this.grades = grades;
//        this.specialty = specialty;
//    }

    public double getAverageGrade() {
        return grades.stream().mapToDouble(a -> a).average().orElse(0);
    }


}
