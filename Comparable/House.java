package Comparable;

import java.util.*;

public class House implements Comparable<House> {
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
    public int compareTo(House other) {
        return Integer.compare(this.area, other.area);
    }

    @Override
    public String toString() {
        return "House" +
                "area" + area +
                "city" + city +
                "hasFurniture" + hasFurniture;
    }
}

class Main {
    public static void main(String[] args) {
        List<House> houses = Arrays.asList(
                new House(50, 17, "Moscow", false),
                new House(70, 8, "Sarov", false),
                new House(99, 25, "Samara", false));

        Collections.sort(houses);

        for (House house : houses) {
            System.out.println(house);
        }

    }
}
