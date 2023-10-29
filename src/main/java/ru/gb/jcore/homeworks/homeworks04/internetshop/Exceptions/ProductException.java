package ru.gb.jcore.homeworks.homeworks04.internetshop.Exceptions;

public class ProductException extends RuntimeException {
    private String name;

    public ProductException(String name) {
        super();
        this.name = name;
    }

    @Override
    public String getMessage() {
        return String.format("Данный товар %s отсутствует в списке", name);
    }
}
