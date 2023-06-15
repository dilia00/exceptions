package homework_3;

public class ExceptionPhone extends Exception {
    public ExceptionPhone() {
        super("Не верный ввод номера телефона");
    }
}