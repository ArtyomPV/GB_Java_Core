package ru.samples.iterableSample.beverage;

import java.util.Iterator;

public class Coffee extends Beverage {
    @Override
    public Iterator<Ingredient> iterator() {
        return new Iterator<>() {
            private int index1 = 0;

            @Override
            public boolean hasNext() {
                return index1 < components.size();
            }

            @Override
            public Ingredient next() {
                return components.get(index1++);
            }
        };
    }
}
