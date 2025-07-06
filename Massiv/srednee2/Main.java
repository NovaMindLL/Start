package Massiv.srednee2;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        double avg1 = fillPrintSumAvg(rand, 4, 6, "1");
        double avg2 = fillPrintSumAvg(rand, 4, 6, "2");

        System.out.println(avg1 == avg2 ? "равны" : avg1 < avg2 ? "1 массив меньше" : "1 массив больше");
    }

    static double fillPrintSumAvg(Random rand, int size, int bound, String label) {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            int val = rand.nextInt(bound);
            System.out.print(val + " ");
            sum += val;
        }
        double avg = (double) sum / size;
        System.out.printf("\nСумма%s: %d\nСреднее%s: %.2f\n\n", label, sum, label, avg);
        return avg;
    }
}
