package tasks.HW19;

// Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
// Пользователь вводит текущий курс и количество рублей.
// Итоговое значение должно быть округлено до двух знаков после запятой.
// (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сумму в рублях");
        int sum = sc.nextInt();

        System.out.println("Введите курс доллара");
        double currency = sc.nextDouble();

        System.out.printf("Итого: %.2f долларов", sum/currency);

    }
}
