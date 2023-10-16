package ru.gb.jcore.seminars.seminar02;

public class Shifter {

    public static void shifter(int[] a, int n){
        n %= a.length;
        int shift = a.length + n;
        shift %= a.length;
        for (int i = 0; i < shift; i++) {
            int temp = a[a.length -1];
            System.arraycopy(a, 0, a,1, a.length-1);
            a[0] = temp;
        }
    }
}
