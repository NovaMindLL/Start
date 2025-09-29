package Stepik_Tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class Main624 {
    public static void main(String[] args) {
        Pair<Integer, List<Integer>> input = readInput();
        int n = input.getFirst();
        List<Integer> data = input.getSecond();
        String result = moveItems(n, data);
        System.out.println(result);
    }

    public static String moveItems(int n, List<Integer> data) {
        List<Integer> newList = new ArrayList<>();

        newList.addAll(n, data);
        newList.addAll(0, data.subList(0, n));
        return newList.toString();
    }

    public static Pair<Integer, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<Integer>>() {
        }.getType();
        List<Integer> data = gson.fromJson(input.split(" \\| ")[1], listType);
        int n = Integer.parseInt(input.split(" \\| ")[0]);

        return new Pair<>(n, data);
    }
}

class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
