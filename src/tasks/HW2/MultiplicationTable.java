package tasks.HW2;

import java.util.Scanner;

// Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа. Использовать циклы запрещено.
public class MultiplicationTable {

    private static void multiTableLoop(int userNum) {
        if (userNum <= 10 && userNum > 0) {
            for (int i = 1; i <= userNum; i++) {
                System.out.println();
                for (int  y = 1; y <= 10; y++) {
                    System.out.println(i + " x " + y + " = " + i*y);
                }
            }
        } else {
            System.out.println("Вы вышли за пределы допустимых значений");
        }
    }

      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextInt()) {
           multiTableLoop(sc.nextInt());
        } else {
            System.out.println("Вы не ввели допустимое значение");
        }

    }
}
