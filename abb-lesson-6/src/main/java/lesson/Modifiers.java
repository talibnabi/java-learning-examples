package lesson;

final class Box {
}
// we aren't allowed to extend it
//class BigBox extends Box {}

class Orange {
    final double weight;

    Orange(double weight) {
        this.weight = weight;
    }
}

public class Modifiers {
    public static void main(String[] args) {
        int x = 5;
        x = 7;

        final int y = 5;
//    y = 7; // can't be reassigned.

        Orange o1 = new Orange(113);
//    o1.weight = 200; // due to final
        Orange o2 = new Orange(115);
    }

}
