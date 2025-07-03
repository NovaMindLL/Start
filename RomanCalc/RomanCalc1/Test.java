package RomanCalc1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a Roman number from 1 to 3");
        String num = scanner.nextLine().trim().toUpperCase();
        int result = romanNumber(num);
        if (result == -1) {
            System.out.println("Enter a Roman correct number from 1 to 3");
        } else
            System.out.println("Roman number:" + result);
        scanner.close();
    }

    ///////

    public static int romanNumber(String roman) {
        switch (roman) {
            case ("I"):
                return 1;
            case ("II"):
                return 2;
            case ("III"):
                return 3;

            default:
                return -1; // incorrect input
        }
    }
}
