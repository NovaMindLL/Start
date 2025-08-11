package error;

public class ErrorExample {
    private ABC abc = new ABC();

    public void foo() {

        // System.out.println(1 / 0);
        // int array[] = { 1, 2, 3 };
        // array[5] = 3;

        try {
            abc.show();
            System.out.println(1 / 0);

        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (ArithmeticException ex) {
            ex.printStackTrace();
        }

        /*
         * if (abc == null) {
         * System.out.println("Null");
         * } else {
         * abc.show();
         * }
         */

    }
}
