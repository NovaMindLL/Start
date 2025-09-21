package Stepik_Tutorial;

import java.util.*;

public class Main514 {
    public static void main(String[] args) {
        int n = readInput();
        int result = 0;
        if (n % 3 == 0) {
            double b = n / 3;
            result = (int) Math.pow(3, b);
        }
        if (n % 3 == 2) {
            int c = n / 3;
            result = (int) Math.pow(3, c) * 2;
        }
        if (n % 3 == 1) {
            int d = (n - 2) / 3;
            result = (int) Math.pow(3, d) * 4;
        }

        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
