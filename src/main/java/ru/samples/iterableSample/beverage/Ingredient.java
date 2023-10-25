package ru.samples.iterableSample.beverage;

public abstract class Ingredient {
    String brand;
    public Ingredient(String brand){
        this.brand = brand;
    }

    @Override
    public String toString() {
        return brand;
    }
}
