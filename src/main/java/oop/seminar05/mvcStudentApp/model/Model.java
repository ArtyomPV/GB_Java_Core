package oop.seminar05.mvcStudentApp.model;

import oop.seminar05.mvcStudentApp.controller.GetModel;

import java.util.List;

public class Model implements GetModel {
    private List<Student> students;

    public Model(List<Student> students) {
        this.students = students;
    }

    public List<Student> getAllStudents(){
        return  students;
    }

    @Override
    public void putAllStudents(List<Student> students) {
        this.students = students;
    }
}
