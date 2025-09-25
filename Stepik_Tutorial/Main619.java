package Stepik_Tutorial;

import com.google.gson.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Main619 {
    public static void main(String[] args) {
        List<String> tags = readInput();

        Map<String, Long> tagMap = tags.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        String result = tagMap.entrySet()
                .stream()
                .map(e -> e.getKey() + ": " + e.getValue())
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }

    public static List<String> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            Gson gson = new Gson();
            String[] dataArray = gson.fromJson(input, String[].class);
            return Arrays.asList(dataArray);
        }
        scanner.close();
        return null;
    }
}