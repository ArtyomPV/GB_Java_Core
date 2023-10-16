package ru.gb.jcore.seminars.seminar02;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}, {7,8,9}};
        ActionWithArray.printTwoDimArray(arr);


        int[] array = {1, 2};
        int size = 2;
        System.out.println(size + " = " + Arrays.toString(array));
        array = ActionWithArray.addToEnd(array, size++, 6);
        System.out.println(size + " = " + Arrays.toString(array));
    }

}
