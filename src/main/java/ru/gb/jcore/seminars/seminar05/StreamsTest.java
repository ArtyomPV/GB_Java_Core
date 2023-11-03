package ru.gb.jcore.seminars.seminar05;

import oop.seminar03.studentDomen.Person;

import java.util.Arrays;
import java.util.List;
//import java.util.function.Predicate;
import java.util.Random;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class StreamsTest {

    /**
     * Отфильтровать и оставить только четные числа
     * Преобразовать каждое число в его квадрат
     * Пропустить первые два элемента потока
     * Ограничить количество элементов в потоке до 3
     * Отсортировать оставшиеся элементы в порядке убывания
     * Преобразовать каждое число в строку с префиксом "Number: "
     */

    // конвейерные методы
    // терминальные методы
    public static void testIntegerCollection() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
                12, 14, 16, 18);
        List<String> result = numbers.stream()
                .filter(number -> number % 2 == 0)
                .map(n -> n * n)
                .skip(2)
                .limit(4)
                .sorted((a, b) -> b - a)
                .map(n -> "Number: " + n)
                .collect(Collectors.toList());

        System.out.println(result);

    }

    /**
     * Отфильтровать и вставить только те строки, которые начинаются на "J".
     * Избавиться от повторений.
     * Преобразовать все строки к верхнему регистру.
     * Пропустить первую строку.
     * Ограничить количество строк в потоке до 2.
     * Отсортировать строки в алфавитном порядке.
     * Добавить к каждой строке суффикс "!"
     */
    public static void testStringsCollection(){
        List<String> strings = Arrays.asList("Java", "Java", "Python", "JavaScript", "C++", "Java", "JavaFX");
        List<String> result = strings.stream()
                .filter(s -> s.startsWith("J"))
                .distinct()
//                .map(s -> s.toUpperCase())
                .map(String::toUpperCase)
                .skip(1)
                .limit(2)
                .sorted()
                .map(s -> s + "!")
//                .collect(Collectors.toList());
                .toList();

        List<Person> somePersons = strings.stream()
                .filter(s -> s.startsWith("J"))
                .distinct()
//                .map(s -> s.toUpperCase())
                .map(String::toUpperCase)
                .skip(1)
                .limit(2)
                .sorted()
                .map(s -> {
                    return new Person(s, s , new Random().nextInt(35));
                })
//                .collect(Collectors.toList());
                .toList();


        System.out.println(result);
        System.out.println(somePersons);
    }
}

