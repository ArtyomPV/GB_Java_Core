package oop.seminar05.mvcStudentApp.controller;

import oop.seminar05.mvcStudentApp.model.Model;
import oop.seminar05.mvcStudentApp.view.View;

public class Controller {
    private View view;
    private Model model;

    public Controller(View view, Model model) {
        this.view = view;
        this.model = model;
    }

    public void update(){
        view.printAllStudents(model.getAllStudents());
    }
}
