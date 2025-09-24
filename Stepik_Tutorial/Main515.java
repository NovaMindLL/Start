package Stepik_Tutorial;

import java.util.*;

public class Main515 {
    public static void main(String[] args) {
        int n = readInput();
        boolean result = false;
        int sumL = 0;
        int sumR = 0;
        int[] array = String.valueOf(n).chars().map(c -> c - '0').toArray();

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                sumL += array[j];
            }
            for (int j = 1; j < array.length; j++) {
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
