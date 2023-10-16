package ru.gb.jcore.seminars.seminar02;

public class Inversion {
    private static int[] change(int[] a){
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 - a[i];
//            a[i] = (a[i] - 1)* -1;
            a[i] = (a[i] + 1) % 2;
        }
        return a;
    }
}
