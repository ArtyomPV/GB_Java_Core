package ru.samples.iteratorSample;

import ru.samples.iteratorSample.beverage.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            /**
             * Создает анонимный экземпляр класса Foo
             */
            @Override
            public void m() {
                System.out.println("m1");
            }
        };
        foo.m();

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(12);
        numbers.add(123);
        numbers.add(1234);

        Iterator<Integer> iterator = numbers.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


        Worker worker = new Worker("Arty", "PV", 47, 100_000);


        Iterator<String> components = worker;
        /*
        В данной конструкции можно использовать объект components, а можно использовать worker
         */
//        while(worker.hasNext()){
//            System.out.println(worker.next());
//        }
        while(components.hasNext()){
            System.out.println(components.next());
        }



    }

}
