package oop.seminar03.studentService;

import lombok.Getter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentCourse implements Iterable<StudentGroup>, Comparable<StudentCourse> {
    private static int number = 0;
    @Getter
    private final int numberOfCourse;
    @Getter
    List<StudentGroup> groups;

    public StudentCourse() {
        this.numberOfCourse = ++number;
        groups = new ArrayList<>();
    }

    public static void setNumber(int number) {
        StudentCourse.number = number;

    }

    public void add(StudentGroup studentGroup) {
        groups.add(studentGroup);
    }


    @Override
    public String toString() {
        return "StudentCourse{" +
                "numberOfCourse=" + numberOfCourse +
                '}';
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < groups.size();
            }

            @Override
            public StudentGroup next() {
                return groups.get(index++);
            }
        };
    }

    @Override
    public int compareTo(StudentCourse o) {
        return this.groups.size() - o.groups.size();
    }
}
