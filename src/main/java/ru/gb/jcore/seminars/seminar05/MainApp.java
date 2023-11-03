package ru.gb.jcore.seminars.seminar05;

import oop.seminar03.studentDomen.Student;

import java.util.Optional;

public class MainApp {
    public static void main(String[] args) {
        /**
         * Запуск программы по методичке
         */
//        CreateSimpleFiles.run();


//        StreamsTest.testIntegerCollection();
//        StreamsTest.testStringsCollection();


        var studentRepository = new PersonRepository();
        Optional<Student> studentOptional = studentRepository.findById("someId");
        if(studentOptional.isPresent()){
            Student student = studentOptional.get();
            System.out.println(student);
        }

//        studentOptional.ifPresent(studentOne -> System.out.println(studentOne));
        studentOptional.ifPresent(System.out::println);

        Student defaultStudent = new Student("Dima", "Dmitriev", 29, 25);

        Student student1 = studentRepository.findById("someId1").orElse(defaultStudent);
//
        System.out.println(student1);

        Student student2 = studentRepository.findById("SomeId")
                .orElseGet(()-> new Student("Petr", "Petrov", 28, 17));
    }
}
