package streamReduce.max;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        num.stream()
                .map(n -> n + ".000")
                .forEach(System.out::println);
    }
}

/*
 * public static void main(String[] args) {
 * List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
 * String defValue = Stream.generate(() -> "0")
 * .limit(3)
 * .reduce("0.", (a, b) -> a + b);
 * System.out.println(defValue);
 * }
 */

/*
 * public static void main(String[] args) {
 * List<String> strings = Arrays.asList("aaa", "bbb", "ccc", "ddd", "ffff");
 * 
 * String min = strings.stream()
 * .reduce("", (left, right) -> left.length() > right.length() ? left : right);
 * System.out.println(min);
 * }
 */

/*
 * public static void main(String[] args) {
 * List<Integer> num = Arrays.asList(11, 2, 3, 4, 5);
 * Integer min = num.stream()
 * .reduce(Integer.MAX_VALUE, Integer::min);
 * System.out.println(min);
 * }
 */
