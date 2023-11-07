package oop.seminar05.mvcStudentApp.model;

import oop.seminar03.studentDomen.Person;

public class Teacher extends Person {
    private String course;

    public Teacher(String firstName, String lastName, int age, String course) {
        super(firstName, lastName, age);
        this.course = course;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return super.toString() + " курс: " + getCourse();
    }
}
