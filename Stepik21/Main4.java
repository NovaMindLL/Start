import java.util.Scanner;

import javax.swing.event.InternalFrameAdapter;

public class Main4 {
    public static void main(String[] args) {
        int x1, x2, x3;
        int max = 0;
        int min = 0;
        String result = "";

        int[] inputValues = readInput();
        x1 = inputValues[0];
        x2 = inputValues[1];
        x3 = inputValues[2];

        for (int i = 0; i < 3; i++) {
            if (inputValues[i] > max) {
                inputValues[i] = max;
            }
            if (inputValues[i] < min) {
                min = inputValues[i];
            }

            String resultMin = Integer.toString(min);
        }

        result = Integer.toString(max);

        System.out.println(result);
    }

    public static int[] readInput() {
        int[] inputValues = new int[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = Integer.parseInt(values[i]);
            }
        }
        scanner.close();

        return inputValues;
    }
}
