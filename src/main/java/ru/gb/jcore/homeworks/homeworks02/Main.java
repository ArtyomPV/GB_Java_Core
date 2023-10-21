package ru.gb.jcore.homeworks.homeworks02;

import ru.gb.jcore.seminars.seminar02.ActionWithArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    private static void task1() {

        int[] array = createOneDimArray();
        int evens = CountEvens.countEvens(array);
        System.out.printf("\n\tКоличество четных элементов в массиве: %d\n", evens);


    }

    private static void task2() {
        int[] array = createOneDimArray();
        int difference = DiffBetweenMinMax.diffBetweenMinMax(array);
        System.out.println(difference);

    }

    public static void task3(){
        int[] array1 = {1,0,0,2,3};
        int[] array2 = {1,2,0,3,0};

        ActionWithArray.showArray(array2);
        if(TwoSimilarElements.findTwoSimilarZeroElements(array2)) {
            System.out.println("В массиве имеются два соседних элемента с нулевым значением");
        } else {
            System.out.println("В массиве отсутствуют два соседних элемента с нулевым значением");
        }
    }


    public static int[] createOneDimArray() {
        int size;

        Scanner sc = new Scanner(System.in);
        System.out.println("ВВедите размер массива: ");
        size = sc.nextInt();

        int[] array = ActionWithArray.fillArray(size);
        System.out.printf("Полученный массив размером %d : \n", size);
        ActionWithArray.showArray(array);
        return array;
    }
}
