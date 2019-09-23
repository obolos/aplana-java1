package tasks.HW9;

// Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран.

import java.util.Scanner;

public class StringInput {

    public static void stringInput(Scanner sc) {
        if (sc.hasNextLine()) {
            String text = sc.nextLine();
            if (text.trim().isEmpty())
                System.out.println("Please enter some symbols");
            else
                System.out.println(text);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        stringInput(sc);

        }
}
