package Massiv.vozrast;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Integer[] mas = new Integer[4];
        Random masRand = new Random();
        for (int i = 0; i < mas.length; i++) {
            mas[i] = masRand.nextInt(89) + 10;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        if (mas[3] > mas[2] && mas[2] > mas[1] && mas[1] > mas[0]) {
            System.out.println("Vozrastaet");
        } else {
            System.out.println("Ne vozrastaet");
        }
    }
}
