package Stepik_Tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.*;

public class Main632 {
    public static void main(String[] args) {
        List<String> data = readInput();
        StringBuilder result = new StringBuilder();

        Map<String, Long> count = data.stream()
                .collect(Collectors.groupingBy(s -> s, Collectors.counting()));
        result = new StringBuilder(count.entrySet().stream()
                .map(e -> e.getKey() + e.getValue())

                .collect(Collectors.joining("")));

        System.out.println(result);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<String>>() {
        }.getType());
    }
}
