package ru.gb.jcore.homeworks.homeworks02;

public class CountEvens {

    public static int countEvens(int[] array){
        int evens = 0;
        for (int j : array) {
            if (j % 2 == 0) {
                evens++;
            }
        }
        return evens;
    }
}
