package ru.gb.jcore.homeworks.homework01.input_note;

import java.util.Scanner;

/**
 * Класс считывает некоторые данные
 */
public class ReadData {
    /**
     * Метод запрашиввет с консоли ввести некоторый текст.
     * @return возвращает строковую переменную со значением которое было введено в консоль
     */
     public static String readFromConsole(){
        String data = "";
        Scanner sc = new Scanner(System.in);
         System.out.println("Введите заметку: ");
        data = sc.nextLine();
        sc.close();
        return data;
    }
}
