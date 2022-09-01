package lesson;

public class EnumProblem {
    public static void doSomething(String color) {
        switch (color.toLowerCase()) {
            case "red": //...
            case "green": //...
            case "yellow": //...
        }
    }

    public static void main(String[] args) {
        doSomething("red");    // +
        doSomething("green");  // +
        doSomething("yellow"); // +
        doSomething("YELLOW"); // +/-
        doSomething("blue");   // --
        doSomething("Yelow");  // --
    }

}
