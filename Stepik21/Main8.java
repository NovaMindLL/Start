import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        String message = readInput();
        String result = "*".repeat(message.length());

        System.out.println(result);
    }

    public static String readInput() {
        String message = "";

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            message = scanner.nextLine();
        }
        scanner.close();

        return message;
    }
}