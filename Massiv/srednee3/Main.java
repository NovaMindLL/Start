package Massiv.srednee3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try (var sc = new Scanner(System.in)) {
            int n;
            do {
                System.out.println("Введи натуральное число больше 3");
                while (!sc.hasNextInt()) {
                    System.out.println("Ошибка: введено не число. Попробуй ещё раз.");
                    sc.next();
                }
                n = sc.nextInt();
                if (n <= 3) {
                    System.out.println("Введи подходящее число");
                }
            } while (n <= 3);
            System.out.println("ok");
        }

    }
}
