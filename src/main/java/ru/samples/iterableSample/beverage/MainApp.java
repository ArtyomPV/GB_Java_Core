package ru.samples.iterableSample.beverage;

import java.util.Iterator;

public class MainApp {
    public static void main(String[] args) {
        Beverage latte = new Coffee();
        latte.addComponents(new Milk("Milk"));
        latte.addComponents(new Sugar("Sugar"));
        latte.addComponents(new Water("Water"));

        for (var ingradient : latte) {
            System.out.println(ingradient);
        }
    }
}
