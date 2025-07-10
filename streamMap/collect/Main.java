package streamMap.collect;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evennum = num.stream()
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evennum);
    }
}
