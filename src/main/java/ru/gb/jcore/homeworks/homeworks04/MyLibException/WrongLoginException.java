package ru.gb.jcore.homeworks.homeworks04.MyLibException;

public class WrongLoginException extends MyLibException{
    private int loginLength;
    public WrongLoginException(int loginLength) {
        super();
        this.loginLength = loginLength;
    }

    @Override
    public String getMessage() {
        return String.format("Введенный логин превышает 20 символов, введено - %d символов", loginLength);
    }
//    public WrongLoginException(String message) {
//        super(message);
//    }
}
