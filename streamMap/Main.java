package streamMap;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Main {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("bob", "job", "petr");
        name.stream()
                .map(StringUtils::capitalize)
                .forEach(System.out::println);
    }
}
