package Exc3;

public class Main {
    public static void main(String[] args) {
        testExp(10, 2);
        testExp(10, 0);
    }

    public static void testExp(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Equally " + result);
        } catch (ArithmeticException e) {
            System.out.println("Dividing by zero");
        } finally {
            System.out.println("Solution is done");
        }
    }
}
