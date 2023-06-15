package homework_3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Data {
    public static String enterData() {
        Scanner enter = new Scanner(System.in);
        System.out.println("Введите фамилию, имя, отчество, дату рождения, номер телефона и пол, через пробел,");
        System.out.println("дата рождения - строка формата dd.mm.yyyy");
        System.out.println("номер телефона - целое беззнаковое число без форматирования");
        System.out.println("пол - символ латиницей f или m");
        return enter.nextLine();
    }

    public static void writeData(String path, String[] array, Boolean arg) {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file, arg)) {
            for (String str : array) {
                writer.write("<" + str + ">");
            }
            writer.write("\n");
            writer.flush();
            System.out.println("Данные успешно сохранены!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Boolean existFile(String path) {
        File file = new File(path);
        return file.isFile();
    }
}
