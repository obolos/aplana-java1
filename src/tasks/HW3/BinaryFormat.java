package tasks.HW3;

// Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.

import java.util.Scanner;

public class BinaryFormat {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        try {
            int x = Integer.parseInt(sc.nextLine(), 2);
            System.out.println("Результатом будет " + x);
        } catch (NumberFormatException e) {
            //e.printStackTrace();
            System.out.println("Введите число в бинарном формате прим. 101");
        }
    }
}
