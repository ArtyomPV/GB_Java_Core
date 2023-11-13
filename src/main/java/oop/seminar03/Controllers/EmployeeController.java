package oop.seminar03.Controllers;

import oop.seminar03.Services.EmployeeScervice;
import oop.seminar03.studentDomen.Employee;
import oop.seminar03.studentDomen.Person;

public class EmployeeController implements PersonController<Employee> {
    private final EmployeeScervice employeeScervice = new EmployeeScervice();
    @Override
    public void create(String firstName, String lastName, int age) {
        employeeScervice.create(firstName, lastName, age);
    }
    public <T extends Person> void paySalary(T person){
        System.out.println(person.getFirstName() + " выплачена зарплата 10 000руб.");
    }
}

