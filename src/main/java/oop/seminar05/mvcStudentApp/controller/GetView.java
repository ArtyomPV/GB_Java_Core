package oop.seminar05.mvcStudentApp.controller;

import oop.seminar05.mvcStudentApp.model.Student;

import java.util.List;

public interface GetView {
    void printAllStudents(List<Student> students);
}
