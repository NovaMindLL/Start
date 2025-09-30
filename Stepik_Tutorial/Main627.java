package Stepik_Tutorial;

import com.google.gson.Gson;
import java.util.*;
import java.util.stream.Collectors;

public class Main627 {
    public static void main(String[] args) {
        Triple<Integer, String, List<Integer>> input = readInput();
        int size = input.getFirst();
        String position = input.getSecond();
        List<Integer> data = input.getThird();
        String result = fillArray(size, position, data);
        System.out.println(result);
    }

    public static String fillArray(int size, String position, List<Integer> data) {
        if (!position.equals("left") && !position.equals("right")) {
            return "Неверная позиция";
        }
        if (data.size() > size) {
            return "Неверный размер";
        }
        if (data.size() == size) {
            return data.stream()
                    .map(String::valueOf)
                    .collect(Collectors.joining(", "));
        } else {
            int n = size - data.size();
            List<Integer> zero = Collections.nCopies(n, 0);
            if (position.equals("left")) {
                List<Integer> list1 = new ArrayList<>();
                list1.addAll(data);
                list1.addAll(zero);
                return list1.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "));

            }
            if (position.equals("right")) {

                List<Integer> list2 = new ArrayList<>(data);
                list2.addAll(zero);
                return list2.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(", "));

            }
        }
        return data.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
    }

    public static Triple<Integer, String, List<Integer>> readInput() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] values = input.split(" \\| ");
        int size = Integer.parseInt(values[0]);
        String position = values[1];
        List<Integer> data = new Gson().fromJson(values[2], new com.google.gson.reflect.TypeToken<List<Integer>>() {
        }.getType());

        return new Triple<>(size, position, data);
    }
}

class Triple<F, S, T> {
    private final F first;
    private final S second;
    private final T third;

    public Triple(F first, S second, T third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }
}
