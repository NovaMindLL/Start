
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int role = readInput();
        String result = null;

        System.out.println(result);
    }

    public static int user(int role){
        Switch(role){
            case ("1"):
            return "admin";
            case 2:
            return "moderator";
            case 3:
            return "user";
         } 
    }

    public static int readInput() {
        int role = 0;

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            role = Integer.parseInt(scanner.nextLine());
        }
        scanner.close();

        return role;
    }
}
