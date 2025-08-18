package metodFunc;

public class Main {
    public static void main(String[] args) {
        int va1 = calcSum(1, 2);
        System.out.println(va1);
    }

    // static void calcSum(int a, int b) {
    // int sum = a + b;
    // System.out.println(sum);
    static int calcSum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
