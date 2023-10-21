package ru.gb.jcore.homeworks.homeworks02;

import ru.gb.jcore.seminars.seminar02.ActionWithArray;
import ru.gb.jcore.seminars.seminar02.FindValueInArray;

public class DiffBetweenMinMax {

    public static int diffBetweenMinMax(int[] array) {
        int min = FindValueInArray.findMinValue(array);
        int max = FindValueInArray.finMaxValue(array);
        return max - min;
    }
}
