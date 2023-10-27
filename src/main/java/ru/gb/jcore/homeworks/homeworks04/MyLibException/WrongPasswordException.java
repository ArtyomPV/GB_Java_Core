package ru.gb.jcore.homeworks.homeworks04.MyLibException;

public class WrongPasswordException extends MyLibException{
    private int passwordLenght;
    private boolean matchPassword;

    public WrongPasswordException(int passwordLenght, boolean matchPassword) {
        super();
        this.passwordLenght = passwordLenght;
        this.matchPassword = matchPassword;
    }

    @Override
    public String getMessage() {
        boolean wrongLength = passwordLenght < 20;
        return String.format(
                "Введенный пароль %s, пароли %s совпадают",
                ((wrongLength)?"верной длины": "слишком длинный"),
                ((matchPassword)?"":" не "));
    }

//    public WrongPasswordException() {
//        super("Введенный пароль превышает длину в 20 символов");
//    } public WrongPasswordException(String message) {
//        super(message);
//    }
}
