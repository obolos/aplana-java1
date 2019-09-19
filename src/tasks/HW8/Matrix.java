package tasks.HW8;
import java.util.Scanner;
import tasks.HW7.ArrayInput;

/*
Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
где каждый элемент умножается на 3. Размерность матрицы задается пользователем.

 */
public class Matrix extends ArrayInput {


    static String msg = "Введите два числа от 1 до 7";

    private static void outputArr(int[][] arr) {
        System.out.println(arr[0].length);
          for (int y = 0; y < arr[0].length; y++) {
                System.out.println("Значение массива arr[" + 0 + "][" + y + "] " + arr[0][y] + " * 3 = " + arr[0][y] * 3);

        }
    }

    private static void initializeArr(int[][] test, Scanner sc) throws Exception {
        for (int i = 0; i < test.length; i++) {
            for (int y = 0; y < test[i].length; y++) {
                System.out.println("Заполните массив числами");
                test[i][y] = sc.nextInt();  // если ввод был не корректным, пробрасываем Exception дальше.
            }
        }
        outputArr(test);
    }

    private static void createArr() throws Exception { // проброс Exception от метода initializeArr
        Scanner sc = new Scanner(System.in);
        int arr[][];

        if(sc.hasNextInt()) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            if ((m >= 1 && m <= 6) && (n >= 1 && n <= 6))
                arr = new int[m][n];
            else {
                arr = new int[1][1];
                System.out.println("Введено неверное значение, размерность массива 1 x 1");
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
