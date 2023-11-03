package ru.gb.jcore.seminars.seminar05;

import oop.seminar03.studentDomen.Student;
import ru.gb.jcore.homeworks.homeworks03.Person;

import java.util.Optional;

public class PersonRepository {

    public Optional<Student> findById(String id){
        if(id.equals("someId")){
            return Optional.of(new Student("Ivan", "Ivanov", 35, 12));
        }
        return Optional.empty();
    }
}
