package tasks.HW4;

/*
Написать программу, которая будет выполнять следующие действия:
1. Ввод трех чисел с клавиатуры x, y, z
2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

import java.util.Scanner;

public class Avg {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int result = (x + y + z) / 3;
        System.out.println(result);
        if(Math.round(result / 2) > 3)
            System.out.println("Программа выполнена корректно");
        }
    }

