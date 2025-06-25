package PRACTICA.prktiks;

public class Test {
    public static void main(String[] args) {
        /* Car myCar = new Car(); */

        Car.xStatic += 20;
        /* System.out.println(Car.xStatic); */

        /* System.out.println(myCar.nonStatic); */
        Car c1 = new Car();
        System.out.println("Статическая переменная с1 " + c1.xStatic);
        c1.nonStatic += 20;
        System.out.println("не статическая переменная с1 " + c1.nonStatic);
        Car c2 = new Car();
        System.out.println("Статическая переменная с2 " + c2.xStatic);
        System.out.println("не статическая переменная с2 " + c2.nonStatic);

    }
}
