package error;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ErrorExample errorExample = new ErrorExample();
        errorExample.foo();
    }
}
