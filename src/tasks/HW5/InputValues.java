package tasks.HW5;

/*
Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
В программе должны присутствовать константы X, Y, Z.
Программа должна сравнивать введенное значение с клавиатуры со значением констант и вывести на экран сообщение
"Данное значение имеется в константах" если number=X или Y или Z.
Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */

import java.util.Scanner;

public class InputValues {
    static String msg = "Данное значение имеется в константах";
    private static final int X = 10;
    private static final int Y = 20;
    private static final int Z = 30;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int number = sc.nextInt();

        switch(number) {
            case X:
            case Y:
            case Z:
                System.out.println(msg);
                break;
            default:
                System.out.println("Такой константы нет!");
        }

    }
}
