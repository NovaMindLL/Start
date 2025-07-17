package innterface;

public class Cat implements Sound {

    String type;

    @Override
    public String getType() {
        return "Koшка";
    }

    public void getSound() {
        System.out.println("Mяy!");
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        System.out.println(cat.getType());
        cat.getSound();
    }
}