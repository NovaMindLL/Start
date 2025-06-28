package peregruz;

public class Test {
    public static void main(String[] args) {
        int x = 100;
        double y = 1.2;
        String name = "Russia";
        System.out.println(add(x, x));
        System.out.println(add(y, y));
        System.out.println(add(name, name));
    }

    public static int add(int x, int y) {
        return x += y;
    }

    public static double add(double x, double y) {
        return x += y;
    }

    public static String add(String x, String y) {
        return x.concat(y);
    }

}
