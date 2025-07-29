package stringJoiner;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        StringJoiner joiner = new StringJoiner(".", "_", ",");
        joiner.add("Jon");
        joiner.add("Jo");
        joiner.add("J");
        System.out.println(joiner);
        System.out.println("---------");

        String string = String.join("-", "1", "2", "3", "4");
        System.out.println(string);
        System.out.println("---------");

        List<String> database = Arrays.asList("As", "vas", "eee");
        String string2 = String.join(",", database);
        System.out.println(string2);
        System.out.println("-------");

        List<String> database2 = Arrays.asList("As", "vas", "eee", "As", "vas", "eee");
        String collect = database2.stream()
                .collect(Collectors.joining(",", "_", "_"));
        System.out.println(collect);
    }
}
