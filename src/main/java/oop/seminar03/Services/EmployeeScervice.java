package oop.seminar03.Services;

import oop.seminar03.studentDomen.Employee;
import oop.seminar03.studentDomen.PersonComparator;
import oop.seminar03.studentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class EmployeeScervice implements PersonService<Employee>{
    private int count;
    private List<Employee> employees;
    public EmployeeScervice(){
        this.employees = new ArrayList<>();
    }


    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Employee employee = new Employee(firstName, lastName, age);
        count++;
        employees.add(employee);
    }

    public List<Employee> getSortedEmpoyeeList(){
        List<Employee> newEmpoyeeList = new ArrayList<>(employees);
        newEmpoyeeList.sort(new PersonComparator<Employee>());
        return newEmpoyeeList;
    }
}
