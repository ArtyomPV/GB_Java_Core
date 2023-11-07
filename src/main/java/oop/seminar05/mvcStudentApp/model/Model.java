package oop.seminar05.mvcStudentApp.model;

import java.util.List;

public class Model {
    private final List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return  students;
    }
}
