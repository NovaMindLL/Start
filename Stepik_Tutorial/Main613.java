package Stepik_Tutorial;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.*;

public class Main613 {
    public static void main(String[] args) {
        InputData inputData = readInput();
        int num = inputData.getNum();

        List<Integer> data = inputData.getData();

        boolean result2 = (data.get(0) > num && data.get(1) > num) && data.stream().allMatch(x -> (x > num));

        System.out.println(result);
    }

    public static InputData readInput() {
        Scanner scanner = new Scanner(System.in);
        String input;
        if (scanner.hasNextLine()) {
            input = scanner.nextLine();
            String[] values = input.split(" \\| ");
            int num = Integer.parseInt(values[0]);
            String json = values[1];
            Gson gson = new Gson();
            List<Integer> data = gson.fromJson(json, new TypeToken<List<Integer>>() {
            }.getType());
            return new InputData(num, data);
        }
        scanner.close();
        return null;
    }
}

class InputData {
    private int num;
    private List<Integer> data;

    public InputData(int num, List<Integer> data) {
        this.num = num;
        this.data = data;
    }

    public int getNum() {
        return num;
    }

    public List<Integer> getData() {
        return data;
    }
}