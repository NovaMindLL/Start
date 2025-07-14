package streamFlatMap.distinct;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("a", "b", "c", "d", "a", "b");
        strings.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
