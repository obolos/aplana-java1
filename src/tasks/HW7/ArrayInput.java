package tasks.HW7;

import java.util.Scanner;

/*
Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */
public class ArrayInput {

    static String msg = "Введите число от 3 до 10";

    private static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.println("Значение массива arr["+i+"] " + arr[i] + " * 2 = " + arr[i]*2);

    }

    private static void initializeArr(int[] test, Scanner sc) throws Exception {
        for (int i = 0; i < test.length; i++) {
            System.out.println("Заполните массив числами");
            test[i] = sc.nextInt();  // если ввод был не корректным, пробрасываем Exception дальше.
        }
        outputArr(test);
    }

     private static void createArr() throws Exception { // проброс Exception от метода initializeArr
        Scanner sc = new Scanner(System.in);
        int arr[];

        if(sc.hasNextInt()) {
            int m = sc.nextInt();
            if ((m > 3 && m <= 10))
                arr = new int[m];
            else {
                arr = new int[3];
                System.out.println("Введено неверное значение, размерность массива 3");
            }
            initializeArr(arr, sc);
        } else {
            System.out.println("Нужно ввести число");
        }
    }

    public static void main(String[] args) {
        System.out.println(msg);

        try {
            createArr();
        } catch (Exception ex) {
            System.out.println("Вы ввели неверное значение");
        }
    }
}
