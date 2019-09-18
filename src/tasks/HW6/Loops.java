package tasks.HW6;

/*
Необходимо с помощью цикла вывести на экран числа от 1 до 50.
 */
public class Loops {

    private static void forLoopExample () {
        for (int i = 1; i <= 50; i++) {
            System.out.println(i);
        }
    }


    private static void whileLoopExample () {
        int x = 1;
        while (x <= 50) {
            System.out.println(x);
            x++;
        }
    }

    public static void main(String[] args) {

        whileLoopExample();
        forLoopExample();

    }
}
