package abstracts;

public class App {
    public static void main(String[] args) {
        Meal pizza = new Pizza(2, 32);
        int newCount = pizza.addCount(23);
        System.out.println(newCount);
        int newPrice = pizza.addPrice(23);
        System.out.println(newPrice);
    }
}
