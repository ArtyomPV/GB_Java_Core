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
    public void updateView(){
//        MVP
        getAllStudents();
        if(testData()){
            view.printAllStudents(students);
        } else {
            System.out.println("Список студентов пустой!");
        }


//        MVC
//        view.printAllStudents(model.getAllStudents());
    }

    public void run(){
        Commands commands = Commands.NONE;
        boolean getNewIteration = true;
        while(getNewIteration){
            String command = view.prompt("Введите команду:");
            commands = Commands.valueOf(command.toUpperCase());
            switch (commands){
                case EXIT:
                    getNewIteration = false;
                    System.out.println("Выход из программы! ");
                    break;
                case LIST:
                    getAllStudents();
                    updateView();
                    break;
                case UPDATE:
                    updateList();
                    break;
                case CREATE:
                    create();
                    break;
                case DELETE:
                    if (delete()) {
                        System.out.println("Студент удален из списка");;
                    } else {
                        System.out.println("Студент с таким именем не найден!");
                    }
                    break;
                case READ:
                    read();
                    break;
            }

        }
    }

    private void read() {
        getAllStudents();
        students.stream().forEach((System.out::println));

    }

    private boolean delete() {
        String nameStudent = view.prompt("Введите имя студента: ");
        getAllStudents();
        Student s = null;
        boolean isFound = false;
        for (Student student : students) {
            if(nameStudent.equals(student.getFirstName())){
                s = student;
//                students.remove(student);

                System.out.println("2");

                isFound = true;
                System.out.println(isFound);
            }
        }
        if(isFound){
            students.remove(s);
            model.putAllStudents(students);
        }
        return isFound;
    }

    private void create() {
        this.students = model.getAllStudents();
        String firstNameStudent = view.prompt("Введите имя: ");
        String lastNameStudent = view.prompt("Введите фамилию: ");
        int ageStudent = Integer.parseInt(view.prompt("Введите возраст: "));
        int idStudent = Integer.parseInt(view.prompt("Введите номер: "));
        Student student = new Student(firstNameStudent, lastNameStudent, ageStudent, idStudent);
        students.add(student);
        model.putAllStudents(students);
        System.out.println(student + " добавлен");
    }

    private void updateList() {
        updateView();
    }
}
