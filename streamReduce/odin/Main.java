package streamReduce.odin;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 3, 4, 5, 6);
        Integer sum = num.stream()
                .reduce(10, (left, right) -> left + right);
        System.out.println(sum);
    }
}
