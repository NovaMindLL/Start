package RomanCalc2;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
        } catch (Exception e) {
        } finally {
            scanner.close();
        }
    }

    public static String calc(String input) throws Exception {
        String[] parts = input.split(" ");
        if (parts.length != 3) {
            throw new Exception("Используйте число операция число");
        }

        String num1Str = parts[0];
        String op = parts[1];
        String num2Str = parts[2];

        // проверяем явл либо оба числа римкими или арабскими

        boolean isRoman = isRoman(num1Str) && isRoman(num2Str);
        boolean isArab = isArab(num1Str) && isArab(num2Str);

        if (isArab == isRoman) {
            throw new Exception("Enter Arab or Roman number");
        }

        int num1 = isRoman ? romanToArabic(num1Str) : Integer.parseInt(num1Str);
        int num2 = isRoman ? romanToArabic(num2Str) : Integer.parseInt(num2Str); // превращаем все числа в Араба

        if (!(num1 >= 1 && num1 <= 10 && num2 >= 1 && num2 <= 10)) {
            throw new Exception(" Number from 1 to 10");
        }

        int result;
        switch (op) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                throw new Exception("Неверная операция");
        }
        if (isRoman) {
            if (result <= 0) {
                throw new Exception(" Римские числа не могут быть равны нулю");
            }
            return arabicToRoman(result);
        } else
            return String.valueOf(result);
    }

    static boolean isRoman(String input) {
        return input.matches("^[IVX]+$");
    }

    static boolean isArab(String input) {
        try {
            int n = Integer.parseInt(input);
            return n >= 1 && n <= 10;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static int romanToArabic(String roman) {
        switch (roman) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return -1;
        }
    }

    static String arabicToRoman(int number) throws Exception {
        String[] romanNum = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X" };
        if (number >= 1 && number <= 10) {
            return romanNum[number];
        }
        throw new Exception(" Число вне диапазона");
    }

}