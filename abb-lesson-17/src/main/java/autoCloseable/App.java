package autoCloseable;

import java.lang.invoke.MutableCallSite;

public class App {
    public static void main(String[] args) {
        autoCloseableTest();
    }

    protected static void autoCloseableTest() {
        try (MySuperFunctionality mySuperFunctionality = new MySuperFunctionality()) {
//            mySuperFunctionality.close();
        } catch (Exception ignored) {
            System.out.println("It was ignored.");
        }
    }
}
