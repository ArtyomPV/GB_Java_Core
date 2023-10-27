package ru.gb.jcore.homeworks.homeworks03;


import java.time.LocalDate;
import java.util.List;

public class Manager extends  Employee{
    public Manager(String name, String middleName, String surName, LocalDate birthday, String position, int salary) {
        super(name, middleName, surName, birthday, position, salary);
    }

    public static void increaseSalary(List<Employee> employees, int amount){
        for (Employee employee: employees){
            if(!(employee instanceof Manager)){
                employee.setSalary(employee.getSalary() + amount);
            }
        }

    }
}


