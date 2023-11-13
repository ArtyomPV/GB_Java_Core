package oop.seminar03;

import oop.seminar03.Controllers.EmployeeController;
import oop.seminar03.studentDomen.*;
import oop.seminar03.studentService.StudentCourse;
import oop.seminar03.studentService.StudentGroup;

import java.util.Collections;

public class MainApp {

    public static void main(String[] args) {
        /**
         * Создаем студентов
         */
        Student student = new Student("Dima", "Petrov", 21, 125);
        Student student1 = new Student("Igor", "Skimen", 20, 130);
        Student student2 = new Student("Andrey", "Alend", 21, 152);
        Student student3 = new Student("Lena", "Ginge", 22, 103);
        Student student4 = new Student("Sveta", "Pipko", 21, 112);
        Student student5 = new Student("Alex", "Sidorov", 20, 113);
        Teacher teacher1= new Teacher("Nina", "Ivanov", 47, "Programming");
        Teacher teacher2 = new Teacher("Diana", "Akulina", 42, "Programming");

        /**
         * Создаем две группы
         */
        StudentGroup studentGroup1 = new StudentGroup();
        StudentGroup studentGroup2 = new StudentGroup();
        studentGroup1.add(student);
        studentGroup1.add(student1);
        studentGroup1.add(student2);
        studentGroup1.add(student3);
        studentGroup2.add(student4);
        studentGroup2.add(student5);

        System.out.println("Список 1й группы");
        for (Student s : studentGroup1) {
            System.out.println(s);
        }

        Collections.sort(studentGroup1.getStudents());
        System.out.println("============== SORTED 1st group ==============");
        for (Student s : studentGroup1) {
            System.out.println(s);
        }


        System.out.println("Список 2й группы");
        for (Student s : studentGroup2) {
            System.out.println(s);
        }
        Collections.sort(studentGroup2.getStudents());
        System.out.println("============== SORTED 2d group ==============");
        for (Student s : studentGroup2) {
            System.out.println(s);
        }
        /**
         * Создаем курс
         */
        StudentCourse studentCourse = new StudentCourse();
        studentCourse.add(studentGroup1);
        studentCourse.add(studentGroup2);
        System.out.println("Сортировка групп");
        Collections.sort(studentCourse.getGroups());
        for (StudentGroup sg: studentCourse) {
            System.out.println(sg);
        }




//        System.out.println(student);
//        System.out.println(teacher);

        Object student02 = new Student("For", "Diter", 25, 132);
//        System.out.println(student2);


        /**
         * сравнение по Дженерик
         */
        PersonComparator<Student> comparatorStudent = new PersonComparator<>();
        comparatorStudent.compare(student1, student2);
        PersonComparator<Teacher> comparatorTeacher = new PersonComparator<>();
        comparatorTeacher.compare(teacher1, teacher2);
        PersonComparator<Person> comparatorPerson = new PersonComparator<>();
        comparatorPerson.compare(teacher1, student3);

    Employee employee1 = new Employee("Boris", "Shark", 47);
    EmployeeController employeeController = new EmployeeController();
    employeeController.paySalary(employee1);
    }
}
