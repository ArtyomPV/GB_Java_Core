package ru.samples.iteratorSample.beverage;

import java.util.Iterator;

public class MainApp {
    public static void main(String[] args) {
        Beverage latte = new Coffee();
        latte.addComponents(new Milk("Milk"));
        latte.addComponents(new Sugar("Sugar"));
        latte.addComponents(new Water("Water"));

        Iterator<Ingredient> iterator = latte;
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
//        while(((Iterator<Ingredient>) latte).hasNext()){
//            System.out.println(((Iterator<Ingredient>) latte).next());
//        }


    }
}
