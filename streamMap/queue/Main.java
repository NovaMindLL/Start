package streamMap.queue;

import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue = name.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toCollection(() -> new LinkedList<>()));
        System.out.println(queue);
    }
}
