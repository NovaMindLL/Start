
import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        int stars = readInput();
        String result = (stars == 1) ? "★"
                : (stars == 2) ? "★★" : (stars == 3) ? "★★★" : (stars == 4) ? "★★★★" : "★★★★★";

        System.out.println(result);
    }

    public static int readInput() {
        int stars = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            stars = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return stars;
    }
}
