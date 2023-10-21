package ru.gb.jcore.seminars.seminar02;

public class FindValueInArray {
    public static int findMinValue(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] < min){
                min = a[i];
            }
        }
        return min;
    }

    public static int finMaxValue(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }
}
