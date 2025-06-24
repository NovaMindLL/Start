package Exc1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("out.txt");
        fileWriter.write("Hello");
        fileWriter.close();

        System.out.println("Program completed");
    }
}
