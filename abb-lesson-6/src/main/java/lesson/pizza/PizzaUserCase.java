package lesson.pizza;

public class PizzaUserCase {
    public static void main(String[] args) {
        Pizza p1 = new Pizza("Margarita", 60);
        Pizza p2 = new Pizza("Margarita", 60);

        // compare not an objects,
        // but references in the memory
        System.out.println(p1 == p2); // false
        Pizza p3 = p2;
        System.out.println(p3 == p2); // true

        // comparing objects
        System.out.println(p1.equals(1)); // false
        System.out.println(p1.equals(new PizzaApp())); // false
        System.out.println(p1.equals(p2)); // true

    }

}
