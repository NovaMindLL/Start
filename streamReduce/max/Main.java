package streamReduce.max;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ffff");

        String min = strings.stream()
                .reduce("", (left, right) -> left.length() > right.length() ? left : right);
        System.out.println(min);
    }
}
/*
 * public static void main(String[] args) {
 * List<Integer> num = Arrays.asList(11, 2, 3, 4, 5);
 * Integer min = num.stream()
 * .reduce(Integer.MAX_VALUE, Integer::min);
 * System.out.println(min);
 * }
 */
