package ru.gb.jcore.homeworks.homework01;

import ru.gb.jcore.homeworks.homework01.input_note.ReadData;
import ru.gb.jcore.homeworks.homework01.write_note.WriteData;

/**
 * Основная программа, которая запрашивает через консоль
 * ввести некоторый текст.
 * Далее введенный текст сохраняет в файле text.txt
 */
public class Main {
    /**
      метод обращается к методу readFromConsole() класса ReadData,
      в котором считывает данные с консоли и передает методу writeToFileTxt класса WriteData,
      который сохраняет его в файл
     */
    /**
     * метод обращается к методу readFromConsole() класса ReadData,
     * в котором считывает данные с консоли и передает методу writeToFileTxt класса WriteData,
     * который сохраняет его в файл
     * @param args обязательный аргумент
     */
    public static void main(String[] args) {
        WriteData.writeToFileTxt(ReadData.readFromConsole());
    }
}
