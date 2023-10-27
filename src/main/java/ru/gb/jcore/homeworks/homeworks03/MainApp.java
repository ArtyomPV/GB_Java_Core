package ru.gb.jcore.homeworks.homeworks03;

import java.time.LocalDate;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {

        Employee worker1 = new Employee("Dima", "Petrovich", "Kyznesov", LocalDate.of(2017, 10, 2), "cleaner", 30000);
        Employee worker2 = new Employee("Nikolay", "Igorevich", "Petrov", LocalDate.of(1976, 12, 5), "casher", 40000);
        Employee worker3 = new Employee("Sergey", "Ivanovich", "Ivanov", LocalDate.of(2002, 3, 19), "cleaner", 30000);
        Employee manager = new Manager("Ivan", "Petrovich", "Petrov",LocalDate.of(1980, 8, 25), "manager", 30000);

        List<Employee> employees = new ArrayList<>();
        employees.add(worker1);
        employees.add(worker2);
        employees.add(worker3);
        employees.add(manager);

        System.out.println(employees);
        BirthDayComparator comparator = new BirthDayComparator();
        Collections.sort(employees, comparator);
        System.out.println(employees);

        Manager.increaseSalary(employees, 5000);
        System.out.println(employees);



    }
}
