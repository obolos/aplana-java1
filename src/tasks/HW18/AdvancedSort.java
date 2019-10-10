package tasks.HW18;

// Написать программу сортировки по возрастанию заданного пользователем массива чисел.
// Пользователь программы должен задавать размер массива и наполнять его числами.
// Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.

import java.util.Arrays;
import java.util.Scanner;

public class AdvancedSort {

    private static void sortMethod(int[] array) { // Сортировка вставками
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }
            array[i + 1] = value;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер массива");

        int[] array = new int[sc.nextInt()];

        System.out.println("Заполните массив значениями");
        for (int i = 0; i < array.length; i++) array[i] = sc.nextInt();

        System.out.println(Arrays.toString(array));
        System.out.println("\nВыполняю сортировку массива");
        sortMethod(array);
        System.out.println(Arrays.toString(array));


    }
}
