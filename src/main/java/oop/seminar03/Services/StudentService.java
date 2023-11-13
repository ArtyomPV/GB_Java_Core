package oop.seminar03.Services;

import oop.seminar03.studentDomen.PersonComparator;
import oop.seminar03.studentDomen.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentService implements PersonService<Student>{

    private int count;
    private List<Student> students;

    public StudentService(){
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Student student = new Student(firstName, lastName, age, ++count);
        students.add(student);
    }

    public List<Student> getSortedStudentList(){
        List<Student> newStudentsList = new ArrayList<>(students);
        newStudentsList.sort(new PersonComparator<Student>());
        return newStudentsList;
    }
}
