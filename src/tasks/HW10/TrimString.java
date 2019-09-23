package tasks.HW10;

// Для введенной с клавиатуры строки необходимо провести отсев пробелов. Результат в виде строки без пробелов вывести на экран.


import java.util.Scanner;

public class TrimString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");

        if (sc.hasNextLine()) {
            String text = sc.nextLine().trim();
            if (text.isEmpty())
                System.out.println("Please enter some symbols");
            else
                System.out.println(text.replaceAll("\\s+", ""));
        }
    }
}
