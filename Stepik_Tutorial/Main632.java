package Stepik_Tutorial;

import java.util.*;
import java.util.stream.*;

public class Main632 {
    public static void main(String[] args) {
        List<String> data = List.of("a", "a", "a", "b", "b", "c", "c", "a", "a", "a");
        StringBuilder result = new StringBuilder();

        int count = 1;
        for (int i = 1; i < data.size(); i++) {
            if (data.get(i).equals(data.get(i - 1))) {
                count++;

            } else {
                result.append(data.get(i - 1)).append(count);
                count = 1;

            }

        }
        if (!data.isEmpty()) {
            result.append(data.get(data.size() - 1)).append(count);
        }
        ; // последний символ

        System.out.println(result);
    }

}
