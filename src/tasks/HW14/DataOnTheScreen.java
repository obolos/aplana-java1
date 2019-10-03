package tasks.HW14;

// Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class DataOnTheScreen {

    private static final String filename = "test.txt";

    private static boolean helperFileCheck(String filename) {
        return new File(filename).isFile();

    } // Helper function

    private static void modernWay() throws IOException {
        Path path = Paths.get(filename);
        if (Files.exists(path))
            Files.lines(path).forEach(System.out::println);
        else
            System.out.println("Wrong file name");
    }

    private static void readBytesWithDataStream() {
        if (helperFileCheck(filename)) {
            try(DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
                byte[] buffer = new byte[512];

                while (dis.available() != 0) {
                    int count = dis.read(buffer);

                    if (count > 0) {
                        System.out.println(new String(buffer));
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        } else
            System.out.println("Wrong file name");
    }

    private static void readBytesWithScanner() {
        if (helperFileCheck(filename)) {
            try (Scanner sc = new Scanner(new FileInputStream(filename))) {
                while (sc.hasNextLine())
                    System.out.println(sc.nextLine());

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            }
        } else
            System.out.println("Wrong file name");
    }

    public static void main(String[] args) {
         // readBytesWithDataStream();
        // readBytesWithScanner();

        try {
             modernWay();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
