import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        int n = readInput();
        System.out.println((long) subfactorial(n));

    }

    public static int factorial(int k) {
        int fac = 1;
        for (int i = 1; i <= k; i++) {
            fac *= i;
        }
        return fac;
    }

    public static double subfactorial(int n) {
        double result = 0;

        for (int j = 0; j <= n; j++) {
            result += Math.pow(-1, j) / factorial(j);
        }
        return factorial(n) * result;

    }

    public static int readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
