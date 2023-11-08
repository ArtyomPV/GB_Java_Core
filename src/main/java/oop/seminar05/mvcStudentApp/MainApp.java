package oop.seminar05.mvcStudentApp;


import oop.seminar05.mvcStudentApp.controller.Controller;
import oop.seminar05.mvcStudentApp.controller.GetModel;
import oop.seminar05.mvcStudentApp.controller.GetView;
import oop.seminar05.mvcStudentApp.model.FileModel;
import oop.seminar05.mvcStudentApp.model.Model;
import oop.seminar05.mvcStudentApp.model.Student;
import oop.seminar05.mvcStudentApp.view.View;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {


        List<Student> students = new ArrayList<>();
        Student student = new Student("Dima", "Petrov", 21, 125);
        Student student1 = new Student("Igor", "Skimen", 20, 130);
        Student student2 = new Student("Andrey", "Alend", 21, 152);
        Student student3 = new Student("Lena", "Ginge", 22, 103);
        Student student4 = new Student("Sveta", "Pipko", 21, 112);
        Student student5 = new Student("Alex", "Sidorov", 20, 113);

        students.add(student);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);

        FileModel fileModel = new FileModel("src/main/resources/StudentsDB.txt");
//        fileModel.saveStudentToFile(students);

//        GetModel model = new Model(students);
        GetModel model  = fileModel;
        GetView view = new View();
        Controller controller = new Controller(view, model);

        controller.update();
    }
}
