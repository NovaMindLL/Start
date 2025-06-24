package Exc2;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        int a = 1;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Ypu cant divide by zero");
        }
        System.out.println("program succefully");
    }
}
