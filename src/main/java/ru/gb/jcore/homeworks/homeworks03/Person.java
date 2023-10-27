package ru.gb.jcore.homeworks.homeworks03;


import java.util.Date;
import java.time.LocalDate;
import java.util.Objects;

public abstract class Person {
    protected String name;
    protected String  middleName;
    protected String surName;
    protected LocalDate birthday;

    public Person(String name, String middleName, String surName, LocalDate birthday) {
        this.name = name;
        this.middleName = middleName;
        this.surName = surName;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getSurName() {
        return surName;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", surName='" + surName + '\'' +
                ", birthday=" + birthday +
                "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) && Objects.equals(middleName, person.middleName) && Objects.equals(surName, person.surName) && Objects.equals(birthday, person.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surName, birthday);
    }
}
