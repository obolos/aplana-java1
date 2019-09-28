package tasks.HW12;

// Необходимо написать программу, которая будет реализовывать следующие действия:
//1. Ввод числа с клавиатуры и запись его в строковую переменную S
//
//2. Конвертация строковой переменной S в числовую переменную X типа int
//
//3. Конвертация числа X типа int в число Y типа double
//
//
//
//Все три числа разных типов необходимо в столбик вывести на экран

import java.util.Scanner;

public class ConvertStrings {
    String S = "";
    int X;
    double Y;

    // Ввод числа с клавиатуры и запись его в строковую переменную S
    private String readNumber() {
        Scanner sc = new Scanner(System.in);

        if (sc.hasNextLine())
            S = sc.nextLine().replaceAll("\\s+", "");

        return S;
    }

    // Конвертация строковой переменной S в числовую переменную X типа int
    private int getNumber(String num) {
        X = Integer.parseInt(num);
        return X;
    }

    // Конвертация числа X типа int в число Y типа double
    private void convertToDouble(int num) {
        Y = num;
    }

    // Все три числа разных типов необходимо в столбик вывести на экран
    private void printNumbers() {
        convertToDouble(getNumber(readNumber()));
    }

    @Override
    public String toString() {
        return  "\n S='" + S + '\'' +
                "\n X=" + X +
                "\n Y=" + Y ;
    }

    public static void main(String[] args) {
        ConvertStrings cs = new ConvertStrings();
        try {
            cs.printNumbers();
            System.out.println(cs);
        } catch (NumberFormatException ex) {
            // ex.printStackTrace();
            System.out.println("Вы ввели " + ex.getMessage().substring(ex.getMessage().indexOf('"')) + " что является не корректным значением");
        }

    }
}
