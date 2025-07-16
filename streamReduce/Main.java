package streamReduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5);
        Optional<Integer> sum = num.stream()
                .reduce((left, right) -> left + right);
        sum.ifPresent(System.out::println);
    }
}
