package oop.seminar03.Controllers;

import oop.seminar03.studentDomen.Person;

public interface PersonController <T extends Person> {
    void create(String firstName, String lastName, int age);
}
