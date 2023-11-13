package oop.seminar05.mvcStudentApp.view;

import oop.seminar05.mvcStudentApp.controller.GetView;
import oop.seminar05.mvcStudentApp.model.Student;

import java.util.List;
import java.util.Scanner;

public class View implements GetView {
    public void printAllStudents(List<Student> students){
        students.forEach(System.out::println);
    }

    @Override
    public String prompt(String text) {
        Scanner in = new Scanner(System.in);
        System.out.println(text);
        return  in.nextLine();
    }
}
