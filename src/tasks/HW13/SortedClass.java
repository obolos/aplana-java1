package tasks.HW13;

/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class SortedClass {
    private Scanner sc = new Scanner(System.in);
    private int[] userArray = new int[2];

     private SortedClass initializeArray() throws InputMismatchException {
         System.out.println("Pls enter size for your array between 2 and 9");
         if (sc.hasNextInt()) {
            int len = sc.nextInt();
            if (len > 1 && len < 10)
                userArray = new int[len];
            else
                System.out.println("you type a wrong size, array size will be eq two");
        }

         return this;

    }

    private SortedClass fillArray() {
        System.out.println("Fill your array");
        for (int i = 0; i < userArray.length; i++)
            userArray[i] = sc.nextInt();

        return this;
    }

    private SortedClass sortArray() {
        for(int i = userArray.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( userArray[j] > userArray[j+1] ){
                int tmp = userArray[j];
                userArray[j] = userArray[j+1];
                userArray[j+1] = tmp;
            }
        }
    }

        return this;

    }

    private SortedClass printResult() {
        StringBuilder result = new StringBuilder();
        for (int n : userArray) {
            result.append(n + ", ");
        }
        result.deleteCharAt(result.length() - 2);
        System.out.println("Your array numbers: [ " + result + "]");

       return this;

    }

    public static void main(String[] args) {
        try {
            new SortedClass().initializeArray().fillArray().printResult().sortArray().printResult();

        } catch (InputMismatchException e) {
            System.out.println("Error please enter only a numeric value");
            //e.printStackTrace();
        }

        }

    }

