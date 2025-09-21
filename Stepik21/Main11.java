import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        var pair = readInput();
        String message = pair.getFirst();
        int k = pair.getSecond();
        String result = "";

        if (k > 0) {
            result = message.repeat(k);
        }
        if (k == 0) {
            result = "";
        }
        if (k < 0) {
            if (message.length() % 2 == 0 && message.length() >= -k) {
                result = message.substring(0, (message.length() / -k) - 1);
            } else {
                result = "NO SOLUTION";
            }
        }

        System.out.println(result);
    }

    public static Pair<String, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        String message = input[0];
        int k = Integer.parseInt(input[1]);
        return new Pair<>(message, k);
    }
}

class Pair<F, S> {
    private final F first;
    private final S second;

    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    public F getFirst() {
        return first;
    }

    public S getSecond() {
        return second;
    }
}
