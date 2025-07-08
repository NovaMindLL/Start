package forEach;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, Integer> num = new HashMap<>();
        num.put(1, 100);
        num.put(2, 200);
        num.put(3, 300);
        num.forEach((key, value) -> System.out.println("key " + key + " value " + value));

    }
}
