package Stepik_Tutorial;

import java.util.*;

public class Main513 {
    public static void main(String[] args) {
        Triple<Integer, Integer, Integer> triple = readInput();
        int n = triple.getFirst();
        int m = triple.getSecond();
        int k = triple.getThird();
        long result = 0;
        long heads = 0;
        if (n < k && n < m) {
            result = -1;
        } else {
            heads = m;
            while (heads > 0) {
                heads -= n; // удар мечем
                result++;
                if (heads <= 0) { // drago povergen
                    break;
                } else {
                    heads += k; // pribavili golovu
                }
            }
        }
        System.out.println(result);
    }

    public static Triple<Integer, Integer, Integer> readInput() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().trim().split(" \\| ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int k = Integer.parseInt(input[2]);
        return new Triple<>(n, m, k);
    }
}

class Triple<A, B, C> {
    private final A first;
    private final B second;
    private final C third;

    public Triple(A first, B second, C third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public A getFirst() {
        return first;
    }

    public B getSecond() {
        return second;
    }

    public C getThird() {
        return third;
    }
}