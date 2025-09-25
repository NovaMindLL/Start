package Stepik_Tutorial;

import java.util.*;

public class Main515 {
    public static void main(String[] args) {
        int n = readInput();
        boolean result = false;

        int[] array = String.valueOf(n).chars().map(c -> c - '0').toArray();

        for (int i = 1; i < array.length; i++) {
            int sumL = 0;
            int sumR = 0;
            for (int j = 0; j < i; j++) {
                sumL += array[j];
            }
            for (int j = i; j < array.length; j++) {
                sumR += array[j];
            }
            if (sumL == sumR) {
                result = true;
                break;
            }
        }
        System.out.println(result);
    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
