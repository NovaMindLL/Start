package PRACTICA.prktiks.praktika;

public class Main {
    public static void main(String[] args) {
        System.out.println("Privet " + getName() + getColor());
    }

    private static String name = "Ivan";
    private static String color = "Black";

    public static String getName() {
        return name;
    }

    public static String getColor() {
        return color;
    }

}
