package Comparable;

public interface Comparable<T> {
    public int compareTo(T o);
}

public class House {
    int area;
    int price;
    String city;
    boolean hasFurniture;

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public String toString() {
        return "House" +
                "area" + area +
                "city" + city +
                "hasFurniture" + hasFurniture;
    }
}

public class Main {
    public static void main(String[] args) {
        House house = new House(50, 17, "Moscow", false);
        House house2 = new House(70, 8, "Sarov", false);
        House house3 = new House(99, 25, "Samara", false);
    }
}
