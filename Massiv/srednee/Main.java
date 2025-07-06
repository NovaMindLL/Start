package Massiv.srednee;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] mas1 = new int[4];
        Random rand1 = new Random();
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i < mas1.length; i++) {
            mas1[i] = rand1.nextInt(6);
            System.out.print(mas1[i] + " ");
            sum1 += mas1[i];
        }
        double sr1 = sum1 / mas1.length;
        System.out.println();
        System.out.println("Сумма1 " + sum1);
        System.out.println("Среднее1 " + sr1);

        System.out.println();
        int[] mas2 = new int[4];
        Random rand2 = new Random();
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = rand2.nextInt(6);
            System.out.print(mas2[i] + " ");
            sum2 += mas2[i];
        }
        double sr2 = sum2 / mas2.length;
        System.out.println();
        System.out.println("Сумма2 " + sum2);
        System.out.println("Среднее2 " + sr2);
        /*
         * if (sr1 < sr2) {
         * System.out.println("1 массив меньше");
         * }
         * if (sr1 > sr2) {
         * System.out.println("1 массив больше");
         * } else {
         * System.out.println("равны");
         * }
         */
        System.out.println();
    }
}
