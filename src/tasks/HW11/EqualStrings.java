package tasks.HW11;

// Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
// Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.

import java.util.Scanner;

public class EqualStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String result;

        System.out.println("pls enter the string one");
        String s1 = sc.nextLine().trim();
        System.out.println("pls enter the string two");
        String s2 = sc.nextLine().trim();

        if (s1.length() == s2.length())
            result = "strings length are the same or you enter space";
        else
            result = (s1.length() > s2.length()) ? s1 : s2;

        System.out.println("And the winner is: " + result);
    }
}
