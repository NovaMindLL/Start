package konstruktor;

public class Main {
    static Cat cat = new Cat();
    static People people = new People();

    public static void main(String[] args) {
        cat.name = "Джордж";
        cat.poroda = "Перситский";
        cat.vozrast = 2;

        people.name = "Alex";
        people.lastName = "Borshuk";
        people.age = 21;
        people.cat = cat;
        System.out.println(people);
        cat.say();
        people.cat.say();
    }

}
