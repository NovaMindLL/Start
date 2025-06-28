package ZadacjiNaZikli.c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter num for summ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;

        }
        System.out.println(sum);

        sc.close();

    }
}
