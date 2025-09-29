package Stepik_Tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;
import java.util.stream.*;

public class Main621 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        String result;

        result = findEvenOddNumbers(data);

        System.out.println(result);
    }

    public static String findEvenOddNumbers(List<Integer> data) {
        String evens = data.stream()
                .filter(x -> x % 2 == 0)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        String evens2 = data.stream()
                .filter(x -> x % 2 != 0)
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        String evens3 = "(" + evens + ") " + "(" + evens2 + ")";
        return evens3;

    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>() {
        }.getType();
        return gson.fromJson(input, listType);
    }
}
