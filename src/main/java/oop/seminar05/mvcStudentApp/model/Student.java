package oop.seminar05.mvcStudentApp.model;

import lombok.Getter;
import oop.seminar03.studentDomen.Person;

public class Student extends Person implements Comparable<Student>{
 @Getter
    private final int studentId;

    public Student(String firstName, String lastName, int age, int id) {
        super(firstName, lastName, age);
        this.studentId = id;
    }

    @Override
    public String toString() {
        return super.toString() + " номер " + studentId;
    }

    @Override
    public int compareTo(Student o) {
        if(this.getAge() == o.getAge()){
            if(this.studentId == o.studentId) return 0;
            else if (this.studentId < o.studentId) return -1;
            return 1;
        }
        else if(this.getAge() < o.getAge()) return  -1;
        return 1;
//        return this.getAge() - o.getAge();
    }
}
