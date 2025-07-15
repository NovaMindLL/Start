package streamSorted;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Person implements Comparable<Person> {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return name + " ";
    }

    @Override
    public int compareTo(Person other) {
        return this.name.compareTo(other.name);
    }
}

public class Main {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Lui"),
                new Person("Zai"),
                new Person("Lui"));

        persons.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
