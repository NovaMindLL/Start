package Zagadki;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Она цветка прекрасный аромат,\n" + //
                "Ценнее всех заслуженных наград,\n" + //
                "Не уроните тот волшебный камень,\n" + //
                "Который между четырьмя руками!");
        Scanner sc = new Scanner(System.in);
        String otvet = sc.nextLine().trim();
        if (otvet.equalsIgnoreCase("Любовь")) {
            Main.hearth();
        } else {
            System.out.println("Попробуй еще шмыкадявка!");
        }
        sc.close();
    }

    public static void hearth() {
        int n = 6; // размер сердца

        for (int i = n / 2; i <= n; i += 2) {
            // Левая часть верхней половины сердца
            for (int j = 1; j < n - i; j += 2) {
                System.out.print(" ");
            }

            // Левая часть звездочек
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Пробел между двумя частями сердца
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Правая часть звездочек
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Нижняя часть сердца
        for (int i = n; i >= 1; i--) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
