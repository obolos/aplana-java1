package tasks.HW17;

// Ввести с консоли число в бинарном формате. Перевести его в десятичный формат, записать в переменную int и вывести на экран.
// Необходимо использовать циклы, нельзя использования готовые методы языка Java,
// для перевода числа из одной системы счисления в другую.

import java.util.Scanner;

public class ConverterBinToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = 0;
        for (int i = str.length() - 1, j = 1; i >= 0; i--, j *= 2) {
            n += (str.charAt(i) - '0') * j; // charAt() возвращает код символа в ascii таблице - '0' приводит к нужному значению
        }
        System.out.println("\"" + str + "\" -> " + n);


    }
}
