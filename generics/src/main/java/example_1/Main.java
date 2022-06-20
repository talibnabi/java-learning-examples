package example_1;

public class Main {
    public static void main(String[] args) {
        //example();
        //example_second();
        //example_third();
        //example_fourth();
        //example_fifth();
    }

    public static void example() {
        Container<Integer> container = new Container<Integer>();
        container.setObject(1);
        Integer integer = container.getObject();
        System.out.println(integer);
    }

    public static void example_second() {
        Container<String> container = new Container<String>("Alisa");
        String text = container.getObject();
        System.out.println(text);
    }

    public static void example_third() {
        Container<Container<String>> insideContainer = new Container<Container<String>>();
        insideContainer.setObject(new Container<String>());
        Container<String> container = insideContainer.getObject();
        container.setObject("Alisa");
        String text = container.method();
        System.out.println(text);
    }

    public static void example_fourth() {
        Container<Integer> container = new Container<>();
        String text = String.valueOf(container.getInsideContainer(new Container<String>()));
        text = "Alisa";
        System.out.println(text);
    }

    public static void example_fifth() {
        Container<Integer> container = new Container<>();
        Container<String> container1 = container.getInsideContainer(new Container<>());
        container1.setObject("Hello");
//        String text = container1.getObject();
//        System.out.println(text);
        Container<Container<String>> container2 = container1.getTwiceInsideContainer(new Container<Container<String>>());
        container2.setObject(new Container<>());
        Container<String> container3 = container2.method();
        container3.setObject("Alisa");
        String text = container3.method();
        System.out.println(text);
    }
}
