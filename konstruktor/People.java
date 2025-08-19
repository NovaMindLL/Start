package konstruktor;

public class People {
    String name;
    String lastName;
    int age;

    Cat cat;

    @Override
    public String toString() {
        return "People " + name + " " + lastName + " " + age + " Есть кот: " + cat;
    }

}
