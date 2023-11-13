package oop.seminar05.mvcStudentApp.model;

import oop.seminar05.mvcStudentApp.controller.GetModel;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileModel implements GetModel {
    private String fileName;

    public FileModel(String fileName) {
        this.fileName = fileName;
        try (FileWriter fw = new FileWriter(fileName, true)) {
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while(line != null){
                String[] param = line.split(" ");
                Student student = new Student(param[0], param[1], Integer.parseInt(param[2]), Integer.parseInt(param[3]));
                students.add(student);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    @Override
    public void putAllStudents(List<Student> students) {
        saveStudentsToFile(students);
        System.out.println("saved");
    }
    public  void saveStudentToFile(Student student)  {
        try (FileWriter fw = new FileWriter(fileName, true)) {
                        try {
                            fw.append(student.getFirstName()).append(" ").append(student.getLastName()).append(" ").append(String.valueOf(student.getAge())).append(" ").append(String.valueOf(student.getStudentId()));
                            fw.append("\n");
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                        }
                        fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    public void saveStudentsToFile(List<Student> students){
        try (FileWriter fw = new FileWriter(fileName)){
            students.forEach(s -> {
                        try {
                        fw.append(s.getFirstName()).append(" ").append(s.getLastName()).append(" ").append(String.valueOf(s.getAge())).append(" ").append(String.valueOf(s.getStudentId()));
                        fw.append("\n");
                        } catch (IOException e) {
                            System.out.println(e.getMessage());
                                }
                            }
                    );
            fw.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}


