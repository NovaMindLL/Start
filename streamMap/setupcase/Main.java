package streamMap.setupcase;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Ver", "Ser", "Her");
        Set<String> upname = name.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
        System.out.println(upname);
    }
}
