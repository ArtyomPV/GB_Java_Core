package ru.gb.jcore.homeworks.homeworks02;

public class TwoSimilarElements {
    public static boolean findTwoSimilarZeroElements(int[] array){
        boolean isZero = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i] == 0){
                if(isZero){
                    return true;
                }
                isZero = true;
            } else {
                isZero = false;
            }
        }
        return false;
    }
}
