package Exc;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {

            FileWriter fileWriter = new FileWriter("out.txt");
            fileWriter.close();
            fileWriter.write("Hello");

        } catch (IOException e) {
            System.out.println("Ошибка нельзя записать файл");
        } finally {
            System.out.println("Vipolnyaus vsegda");
        }
        System.out.println("Программа работает успешно");
    }
}
