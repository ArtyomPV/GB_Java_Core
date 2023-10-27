package ru.gb.jcore.homeworks.homeworks03;

import java.time.LocalDate;
import java.util.Comparator;

public class BirthDayComparator  implements  Comparator<Person>{


    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBirthday().compareTo(o2.getBirthday());
    }
}
