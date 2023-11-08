package oop.seminar05.mvcStudentApp.controller;
import oop.seminar05.mvcStudentApp.model.Student;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private final GetView view;
    private final GetModel model;
    private List<Student> students;

    public Controller(GetView view, GetModel model) {
        this.view = view;
        this.model = model;
        this.students = new ArrayList<>();
    }
public void getAllStudents(){
        students = model.getAllStudents();
}
public boolean testData(){
//        if(!students.isEmpty()) return true;
//        return false;
    return !students.isEmpty();
}
    public void update(){
//        MVP
        getAllStudents();
        if(testData()){
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пустой1");
        }


//        MVC
//        view.printAllStudents(model.getAllStudents());
    }
}
