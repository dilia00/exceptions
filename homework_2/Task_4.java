package homework_2;

import java.util.Scanner;

public class Task_4 {
    // Разработайте программу, которая выбросит Exception, когда пользователь вводит
    // пустую строку. Пользователю должно показаться сообщение, что пустые строки
    // вводить нельзя.
    public static void strInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String str = sc.nextLine();
        if (!str.isEmpty()) {
            System.out.println(str);
        } else {
            System.out.println("Пустые строки вводить нельзя");
            throw new RuntimeException("Строка пустая!");
        }
    }

    public static void main(String[] args) {
        strInput();
    }
}
