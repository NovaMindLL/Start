package getCallerClassAndMethodName;

public class Main {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        if (stackTrace.length < 3) {
            return null;
        }
        StackTraceElement caller = stackTrace[2];
        return caller.getClassName() + "#" + caller.getMethodName();
    }

    public static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }
}
