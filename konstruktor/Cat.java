package konstruktor;

public class Cat {
    int vozrast;
    String poroda;
    String name;

    void say() {
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat " + name + " " + poroda + " " + vozrast;
    }

}
