package error;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ErrorExample {
    private ABC abc = new ABC();

    public void foo() {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        // System.out.println(1 / 0);
        // int array[] = { 1, 2, 3 };
        // array[5] = 3;

        // try {
        // abc.show();
        // System.out.println(1 / 0);

        // } catch (NullPointerException | ArithmeticException e) {
        // e.printStackTrace();

        /*
         * if (abc == null) {
         * System.out.println("Null");
         * } else {
         * abc.show();
         * }
         */

    }
}
