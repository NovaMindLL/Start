package Stepik_Tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.*;

public class Main626 {
    public static void main(String[] args) {
        Pair<Integer, List<String>> input = readInput();
        int power = input.getFirst();
        List<String> items = input.getSecond();
        int result = increasePower(power, items);
        System.out.println(result);
    }

    public static int increasePower(int power, List<String> items) {
        int num = Collections.frequency(items, "Зелье");
        int res = 0;
        int res2 = 0;
        if (power < 100) {
            res = power + (10 * num);
            if (res > 100) {
                res2 = 100;
            }
        } else {
            res2 = res;
        }
        return res2;
    }

    public static Pair<Integer, List<String>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Gson gson = new Gson();
        Type listType = new TypeToken<List<String>>() {
        }.getType();
        List<String> items = gson.fromJson(input.split(" \\| ")[1], listType);
        int power = Integer.parseInt(input.split(" \\| ")[0]);

        return new Pair<>(power, items);
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
