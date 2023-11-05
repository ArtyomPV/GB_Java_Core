package oop.seminar03.studentService;

import oop.seminar03.studentDomen.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> students;

    public StudentGroup() {
        this.students = new ArrayList<>();
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Student> add(Student student){
        students.add(student);
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "students=" + students +
                '}';
    }

    @Override
    public Iterator<Student> iterator(){
        return new Iterator<Student>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index<students.size();
            }

            @Override
            public Student next() {

                return students.get(index++);
            }
        };
    }

    @Override
    public int compareTo(StudentGroup o) {
        return this.students.size() - o.students.size() ;
    }


//    @Override
//    public Iterator<Student> iterator() {
//        return new StudentGroupIterator(this.students);
//    }
//
//    static class StudentGroupIterator implements Iterator<Student> {
//        private int counter;
//        private final List<Student> students;
//        public StudentGroupIterator(List<Student> students) {
//            this.students = students;
//        }
//
//        @Override
//        public boolean hasNext() {
//            return counter<students.size();
//        }
//
//        @Override
//        public Student next() {
//            return students.get(counter++);
//        }
//    }
}
