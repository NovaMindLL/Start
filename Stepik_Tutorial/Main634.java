package Stepik_Tutorial;

import java.util.*;
import java.util.stream.*;

public class Main634 {
    public static void main(String[] args) {
        String message = readInput();
        StringBuilder result = new StringBuilder();

        List<String> list = new ArrayList<>();

        for (int i = 0; i < message.length(); i += 2) {
            char input = message.charAt(i);
            int count = Character.getNumericValue(message.charAt(i + 1));

            for (int j = 0; j < count; j++) {
                result.append(input).append(", ");

            }

        }
        String res1 = result.substring(0, result.length() - 2);
        System.out.println(res1);
    }

    public static String readInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
