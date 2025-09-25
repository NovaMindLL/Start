package Stepik_Tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.*;

public class Main61 {
    public static void main(String[] args) {
        List<Integer> data = readInput();
        boolean result = false;
        for (int i = 0; i < data.size() - 1; i++) {
            if (data.get(i) % 2 != 0) {
                result = false;
            } else {
                result = true;
            }
        }

        System.out.println(result);
    }

    public static List<Integer> readInput() {
        List<Integer> data = null;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            Gson gson = new Gson();
            data = gson.fromJson(input, new TypeToken<List<Integer>>() {
            }.getType());
        }
        scanner.close();

        return data;
    }
}
