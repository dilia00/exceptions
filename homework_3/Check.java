package homework_3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Check {
    public static Boolean checkData(String[] array) {
        if (array.length != 6) {
            throw new RuntimeException("не верное количество данных!");
        }
        return true;
    }

    public static void checkPhone(String arg) throws ExceptionPhone {
        try {
            Long.valueOf(arg);
        } catch (Exception e) {
            throw new ExceptionPhone();
        }
    }

    public static void checkBirthDay(String arg) throws ExceptionDate {
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            LocalDate date = LocalDate.parse(arg, format);
        } catch (Exception e) {
            throw new ExceptionDate();
        }
    }

    public static void checkGender(String arg) throws ExceptionSex {
        if (!arg.equals("f") && !arg.equals("m")) {
            throw new ExceptionSex();
        }
    }
}
