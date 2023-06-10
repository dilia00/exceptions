package homework_2;

import java.util.Scanner;

public class Task_1 {
    // Реализуйте метод, который запрашивает у пользователя ввод дробного числа
    // (типа float), и возвращает введенное значение. Ввод текста вместо числа не
    // должно приводить к падению приложения, вместо этого, необходимо повторно
    // запросить у пользователя ввод данных.
    public static float floatInput() {
        Scanner sc = new Scanner(System.in);
        float inputNum;
        while (true) {
            System.out.print("Введите дробноe число: ");
            try {
                inputNum = Float.parseFloat(sc.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод! Введите дробноe число!");
            }
        }
        return inputNum;
    }

    public static void main(String[] args) {
        System.out.println(floatInput());
    }
}
