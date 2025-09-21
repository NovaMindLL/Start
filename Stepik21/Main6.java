import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        int x, y, x1 = 0, y1;
        String direction, result = "";

        String[] inputValues = readInput();
        x = Integer.parseInt(inputValues[0]);
        y = Integer.parseInt(inputValues[1]);
        direction = inputValues[2];
        if(direction.equals("left")){
            x1 = x-1;
        } if(direction.equals("right")){
            x1 = x+1;
        } if(direction.equals("up")){
            y1 = y-1;
        } if(direction.equals("down")){
            y1 = y+1;
        }
        else {
            x1=x;
            y1=y;
        } 



        System.out.println("x: " + x1 + ", y: " + y1 + ", direction: " + direction);
    }

    public static String[] readInput() {
        String[] inputValues = new String[3];

        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] values = input.split(" ");
            for (int i = 0; i < 3; i++) {
                inputValues[i] = values[i];
            }
        }
        scanner.close();

        return inputValues;
    }
}
