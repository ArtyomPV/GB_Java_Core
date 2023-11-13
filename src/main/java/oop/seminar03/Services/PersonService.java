package oop.seminar03.Services;

import java.util.List;

public interface PersonService<T> {
    List<T> getAll();
    void create(String firstName, String lastName, int age);
}
