package oop.seminar05.mvcStudentApp.view;

import oop.seminar05.mvcStudentApp.controller.GetView;
import oop.seminar05.mvcStudentApp.model.Student;

import java.util.List;

public class View implements GetView {
    public void printAllStudents(List<Student> students){
        students.forEach(System.out::println);
    }
}
