package homework_3;

import homework_3.Data;
import homework_3.Check;

public class Main {
    public static void main(String[] args) throws ExceptionPhone, ExceptionDate, ExceptionSex {
        String data = Data.enterData();
        String[] array = data.split(" ");
        if (Check.checkData(array)) {
            String surname = array[0];
            String birthDay = array[3];
            String phone = array[4];
            String sex = array[5];
            Check.checkBirthDay(birthDay);
            Check.checkPhone(phone);
            Check.checkGender(sex);
            Data.writeData("homework_3/Book/" + surname + ".txt", array,
                    Data.existFile("homework_3/Book/" + surname + ".txt"));
        }
    }

}
