package homework_1;

import java.util.Arrays;

public class task {

    public static void main(String[] args) {
        // 1 Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для
        // Java исключения;

        // exception1(5, 0);
        // exception2();
        // exception3();

        // 2 Посмотрите на код, и подумайте сколько разных типов исключений вы тут
        // сможете получить?

        // String[][] arr = new String[][] {
        // { "1", "2", "3", "4", "5", "6", "7" },
        // { "null", "2", "3", "4", "5", "6", "7" }
        // };

        // String[][] arr2 = new String[][] { null };

        // String[][] arr3 = new String[][] {
        // { "1", "2", "3", "4", "5", "6", "7" },
        // { "1", "2", "3" }
        // };

        // System.out.println(sum2d(arr3));

        // NumberFormatException: For input string: "null"
        // NullPointerException: Cannot load from object array because "arr[i]" is null
        // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

        // 3 Реализуйте метод, принимающий в качестве аргументов два целочисленных
        // массива, и возвращает новый массив, каждый элемент которого равен разности
        // элементов двух входящих массивов в той же ячейке. Если длины массивов не
        // равны, необходимо как-то оповестить пользователя.

        int[] arr1 = new int[] { 6, 5, 4 };
        int[] arr2 = new int[] { 3, 2, 1 };
        System.out.println(Arrays.toString(difference(arr1, arr2)));

    }

    private static int exception1(int a, int b) {
        return a / b;
    }

    private static void exception2() {
        int[] arr = new int[] { 1, 2, 3, 4, 5, };
        System.out.println(arr[5]);
    }

    private static void exception3() {
        Integer a = null;
        int num = a;
        System.out.println(num);
    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

    private static int[] difference(int[] arr1, int[] arr2) {
        int[] newArr = new int[arr1.length];
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длинна массивов должна быть одинаковой");
        }
        for (int i = 0; i < arr1.length; i++) {
            newArr[i] = arr1[i] - arr2[i];
        }
        return newArr;
    }

}
