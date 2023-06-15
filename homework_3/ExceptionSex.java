package homework_3;

public class ExceptionSex extends Exception {
    public ExceptionSex() {
        super("Не верный ввод пола, введите f или m");
    }
}