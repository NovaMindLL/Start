package pereopredelenie;

public class Animal {
    public void voice() {
        System.out.println("Это мой голос");
    }
}

class Cat extends Animal {
    /* @Override */
    public void voice() {
        super.voice();
        System.out.println("Bark!");
    }
}

class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.voice();
    }
}
