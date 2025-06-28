package pereopredelenie;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter num");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("vi vveli " + sc.nextLine());

        }
    }
}