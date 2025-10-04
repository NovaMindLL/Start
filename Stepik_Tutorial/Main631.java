package Stepik_Tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.*;
import java.util.stream.Collectors;

public class Main631 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        List<Integer> result = deleteZeroValues(data);
        System.out.println(new Gson().toJson(result));
    }

    public static List<Integer> deleteZeroValues(List<Integer> data) {
        return data.stream()
                .filter(x -> !x.equals(1))
                .collect(Collectors.toList());
    }

    public static List<Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return new Gson().fromJson(input, new TypeToken<List<Integer>>() {
        }.getType());
    }
}
