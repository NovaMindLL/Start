package streamApi;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();

        animals.stream()
                .filter(animal -> animal.getClassification()
                        .equals(Classification.PREDATOR))
                .forEach(System.out::println);
        System.out.println("------");

        animals.stream()
                .sorted(Comparator.comparing(Animal::getAge)
                        .thenComparing(Animal::getName)
                        .reversed())
                .forEach(System.out::println);
        System.out.println("--------");
        boolean allMatch = animals.stream()
                .allMatch(animal -> animal.getAge() > 10);
        System.out.println(allMatch);
        System.out.println("-------");
        boolean anyMatch = animals.stream()
                .anyMatch(animal -> animal.getAge() > 10);
        System.out.println(anyMatch);
        System.out.println("-------");
        boolean noneMatch = animals.stream()
                .noneMatch(animal -> animal.getName().equals("Медведь"));
        System.out.println(noneMatch);
        System.out.println("-------");
        animals.stream()
                .max(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);
        System.out.println("--------");
        animals.stream()
                .min(Comparator.comparing(Animal::getAge))
                .ifPresent(System.out::println);
        System.out.println("--------");

        Map<Classification, List<Animal>> classificationListMap = animals.stream()
                .collect(Collectors.groupingBy(Animal::getClassification));
        classificationListMap.forEach(((classification, animals1) -> {
            animals1.forEach(System.out::println);
            System.out.println();
        }));
        System.out.println("--------");

    }

    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Тигр", 15, Classification.PREDATOR),
                new Animal("Жираф", 25, Classification.HERBIVORE),
                new Animal("Волк", 25, Classification.PREDATOR),
                new Animal("Кенгуру", 12, Classification.HERBIVORE),
                new Animal("Медведь", 20, Classification.OMNIVOROUS),
                new Animal("Панда", 18, Classification.HERBIVORE),
                new Animal("Ворон", 5, Classification.OMNIVOROUS),
                new Animal("Лиса", 8, Classification.PREDATOR));
    }
}
