package ru.samples.iterableSample.beverage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class Beverage implements Iterable<Ingredient> {
    protected final List<Ingredient> components;
    protected int index;
    public Beverage(){
        components = new ArrayList<>();
        index = 0;
    }
    public void addComponents(Ingredient component){
        components.add(component);
    }

}
