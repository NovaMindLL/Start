package Massiv;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Integer[] massiv = new Integer[8];
        Random random = new Random();
        for (int i = 0; i < massiv.length; i++) {
            massiv[i] = random.nextInt(10) + 1;
            System.out.print(massiv[i] + " ");

        }
        System.out.println();
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] % 2 != 0) {
                massiv[i] = 0;
            }
        }
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i] + " ");
        }

    }
}
