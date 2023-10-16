package ru.gb.jcore.seminars.seminar02;

import java.util.Arrays;

public class ActionWithArray {

    public static int[][] fillDiagonalElements(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            a[i][i] = 1;
            a[i][a.length - 1 - i] = 1;
        }
        return a;
    }

    public static void printTwoDimArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    /**
     * Сложность O(n^2)
     *
     * @param a одноиерный массив
     * @return возвращат истину если есть баланс в массиве, ложь если нет баланса
     */
    public static boolean checkBalance(int[] a) {
        int left = 0;
        for (int i = 0; i < a.length - 1; i++) {
            left += a[i];
            int right = 0;
            for (int j = i + 1; j < a.length; j++) {
                right += a[j];
            }
            if (left == right) return true;
        }
        return false;
    }

    /**
     * Сложность O(2n)
     *
     * @param a одноиерный массив
     * @return возвращат истину если есть баланс в массиве, ложь если нет баланса
     */
    public static boolean checkBalance2(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        if (sum % 2 != 0) return false;
        int left = 0;
        for (int i = 0; i < a.length; i++) {
            left += a[i];
            sum -= a[i];
            if (left == sum) return true;
        }
        return false;
    }

    public static boolean checkbalance2(int[] a){
        int lbound = 0;
        int rbound = a.length -1;
        int left = 0;
        int right = 0;
        while(lbound <= rbound){
            if(left > right)
                right += a[rbound--];
            else
                left += a[lbound++];
        }
        return left == right;
    }

    public static int[] addToEnd(int[]arr, int current, int value){
        if(current == arr.length){
            int[] temp = new int[arr.length*2];
            System.arraycopy(arr, 0, temp, 0, arr.length);
            arr = temp;
        }
        arr[current++] = value;
        return arr;
    }
        public static void pigeonSort(int [] arr){
        final int min = findValueInArray.findMinValue(arr);
        final int max = findValueInArray.finMaxValue(arr);

        int[] frequency = new int[max - min +1];
            for (int i = 0; i < arr.length; i++) {
                frequency[arr[i] - min]++;
            }
            int arrIndex = 0;
            for (int i = 0; i < frequency.length; i++) {
                for(int elems = frequency[i]; elems > 0; elems--){
                    arr[arrIndex++] = i +min;
                }
            }
        }

}


