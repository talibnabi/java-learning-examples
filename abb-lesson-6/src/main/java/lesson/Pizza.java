package lesson;

public class Pizza {
    public String name;
    public Integer size;

    public Pizza(String n, Integer s) {
        this.name = n;
        this.size = s;
    }

    @Override
    public boolean equals(Object given) {
        if (given == null) return false;
        if (this == given) return true; // p1.equals(p1)
        if (!(given instanceof Pizza that)) return false; // p1.equals(Apple)

        return this.size.equals(that.size) // Integer.equals
                && this.name.equals(that.name); // String.equals
    }

    public void printMe() {
        System.out.printf(
                "Pizza name %s of size %d\n",
                name, size);
    }

    public static void main(String[] args) {
        Pizza p1 = new Pizza("Margarita", 30);
        Pizza p2 = new Pizza("Quattroformaggi", 60);
        p1.printMe();
        p2.printMe();
    }


}
