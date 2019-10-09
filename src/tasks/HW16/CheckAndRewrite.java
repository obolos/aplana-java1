package tasks.HW16;

// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt, а потом в этот же файл
// перезаписывать текстовые данные, введенные вручную. Количество строк после перезаписи должно быть столько же,
// сколько и в изначальном варианте.

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class CheckAndRewrite {
    private String filename = null;
    private int count = 0;

    private void enterFileName() {
        System.out.println("Пож-та введите имя файла");
        filename = new Scanner(System.in).nextLine() + ".txt";
    }

    private void checkFileLength() {
        enterFileName();
        Path path = Paths.get(filename);
        if (!Files.exists(path)) {
            System.out.println("Файл не найден");
            return;
        }
        try {
            if (Files.lines(path).count() == 0) {
                System.out.println("Файл пуст хотите восстановить из резервной копии? Y - да");
                if (new Scanner(System.in).nextLine().equalsIgnoreCase("Y")) {
                    restoreFile();
                    System.out.println("Файл восстановлен...");
                    return;
                } else {
                    System.out.println("Очень жаль в другой раз...");
                    return;
                }
            }
                readFromFile();
                writeToFile();

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    private void restoreFile() {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new FileReader("copy.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            while ((s = reader.readLine()) != null) {
                writer.write(s);
                writer.newLine();
                writer.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void writeToFile() {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            System.out.println("Кол-во строк " + count);
            while (count > 0) {
                String s = new Scanner(System.in).nextLine();
                writer.write(s);
                writer.newLine();
                writer.flush();
                count--;
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private void readFromFile() {
        String s = null;
        try (BufferedReader reader = new BufferedReader(new FileReader(filename));
             BufferedWriter writer = new BufferedWriter(new FileWriter("copy.txt"))) {
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
                count++;
                writer.write(s);
                writer.newLine();
                writer.flush();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        new CheckAndRewrite().checkFileLength();

    }
}

