package ru.samples.comparableSample;

import java.time.LocalDate;
import java.util.*;

public class MainApp {
    public static void main(String[] args) {
        //region Workers
//        Random r = new Random();
//        List<Worker> db = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            db.add(new Worker("Имя" + r.nextInt(0, 10), "Фамилия" + r.nextInt(0, 30), r.nextInt(18, 65), r.nextInt(1000, 3000)));
//        }
//        System.out.println(db);
//        Collections.sort(db);
//        System.out.println(db);
        //endregion

        //region Students
//        List<Student> students = new ArrayList<>();
//        students.add(new Student("Igor", new Date(2002, 1 , 10)));
//        students.add(new Student("Petr", new Date(1976, 10 , 3)));
//        students.add(new Student("Igor", new Date(1980, 8 , 27)));
//
//        Collections.sort(students);
//        System.out.println(students);
        //endregion


        //region Pupils
        List<Pupil> pupils = new ArrayList<>();
        pupils.add(new Pupil("Igor", LocalDate.of(1980, 1, 11)));
        pupils.add(new Pupil("Igor", LocalDate.of(1976, 11, 10)));
        pupils.add(new Pupil("Igor", LocalDate.of(2002, 12, 2)));
        Collections.sort(pupils, new Comparator<Pupil>() {
            @Override
            public int compare(Pupil o1, Pupil o2) {
                return o1.getDate().compareTo(o2.getDate());
            }
        });
        System.out.println(pupils);
        //endregion


        List<Client> clients = new ArrayList<>();
        clients.add(new Client("Igor", LocalDate.of(1980, 1, 11)));
        clients.add(new Client("Igor", LocalDate.of(1976, 11, 10)));
        clients.add(new Client("Igor", LocalDate.of(2002, 12, 2)));

//        Collections.sort(clients);
    }



}
