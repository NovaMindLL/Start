package streamCollecGroup;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

class Human {
    private String name1, name2;
    private int freind;

    public Human(String name1, String name2, int freind) {
        this.name1 = name1;
        this.name2 = name2;
        this.freind = freind;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }

    public int getFreind() {
        return freind;
    }

    public String toString() {
        return name1 + " " + name2 + " " + freind;
    }

}

public class Main {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned", "Stark", 1),
                new Human("Robb", "Stark", 2),
                new Human("Arya", "Stark", 1),
                new Human("Aegon", "Targaryen", 6),
                new Human("Daenerys", "Targaryen", 4),
                new Human("Jaime", "Lannister", 1),
                new Human("Tyrion", "Lannister", 3));
        var map = humans.stream()
                .collect(Collectors.groupingBy(Human::getName2,
                        Collectors.mapping(Human::getName1, Collectors.toSet())));
        map.forEach((k, v) -> System.out.println(k + ": " + v));
    }
}