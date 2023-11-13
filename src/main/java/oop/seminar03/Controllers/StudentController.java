package oop.seminar03.Controllers;

import oop.seminar03.Services.StudentService;
import oop.seminar03.studentDomen.Student;

public class StudentController implements PersonController<Student>{
    private final StudentService dataService = new StudentService();


    @Override
    public void create(String firstName, String lastName, int age) {
        dataService.create(firstName, lastName, age);
    }

}
