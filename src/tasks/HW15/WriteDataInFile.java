package tasks.HW15;

//Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
// Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли. Пользователь при тестировании
// программы по правилу черного ящика должен понимать, какой принцип остановки записи в файл он должен подать.

import java.io.*;

public class WriteDataInFile {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to our Editor v0.1 \n when you done just type stop word :) \"стоп\" ");

        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter out = new BufferedWriter(new FileWriter("output.txt"))) {
            String inputLine = null;
            do {
                inputLine=in.readLine();
                out.write(inputLine);
                out.newLine();
            } while (!inputLine.equalsIgnoreCase("стоп"));
            System.out.print("Write Successful");
        } catch(IOException e) {
            System.out.println("Error during reading/writing");
        }
    }

    }

