package streamApi;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = getAnimals();
        animals.stream()
                .filter(animal -> animal.getClassification().equals(Classification.PREDATOR))
                .forEach(System.out::println);
    }

    private static List<Animal> getAnimals() {
        return List.of(
                new Animal("Тигр", 15, Classification.PREDATOR),
                new Animal("Жираф", 25, Classification.HERBIVORE),
                new Animal("Волк", 10, Classification.PREDATOR),
                new Animal("Кенгуру", 12, Classification.HERBIVORE),
                new Animal("Медведь", 20, Classification.OMNIVOROUS),
                new Animal("Панда", 18, Classification.HERBIVORE),
                new Animal("Ворон", 5, Classification.OMNIVOROUS),
                new Animal("Лиса", 8, Classification.PREDATOR));
    }
}
