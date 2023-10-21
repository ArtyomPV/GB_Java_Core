package ru.gb.jcore.seminars.seminar02;

import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
//        int[]arr = ActionWithArray.fillArray(5);
//        ActionWithArray.showArray(arr);
//        System.out.println();
//        System.out.println(Arrays.toString(arr));

//        int[][] arr = {{1,2,3},{4,5,6}, {7,8,9}};
//        ActionWithArray.printTwoDimArray(arr);
//
//
//        int[] array = {1, 2};
//        int size = 2;
//        System.out.println(size + " = " + Arrays.toString(array));
//        array = ActionWithArray.addToEnd(array, size++, 6);
//        System.out.println(size + " = " + Arrays.toString(array));

        MyHashSet.add(7);
        MyHashSet.add(1);
        MyHashSet.add(4);
        MyHashSet.add(2);
        MyHashSet.add(8);
        System.out.println(MyHashSet.isValue(7));
        System.out.println(MyHashSet.findRandomValue());
        System.out.println(MyHashSet.delete(10));


    }

}
