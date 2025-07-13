package streamFlatMap;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

class Human {
    private final String name;
    private final List<String> pets;

    public Human(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }

    public String toString() {
        return " " + pets;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Sam", Arrays.asList("Buddy", "Lucy")),
                new Human("Bob", Arrays.asList("Frankie", "Rosie")),
                new Human("Marta", Arrays.asList("Simba", "Tilly")));

        List<String> petNames = humans.stream()
                .flatMap(human -> human.getPets().stream())
                .collect(Collectors.toList());
        System.out.println(petNames);
    }
}
