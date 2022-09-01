package oop;

abstract class Car {
    public abstract void drive();
}

class Ford extends Car {

    @Override
    public void drive() {
        System.out.println("The FORD is driving (overridden)");
    }

    public void accelerate() {
        System.out.println("The FORD is accelerating");
    }
}

public class Inheritance {
    public static void main(String[] args) {
//    Car car = new Car();
//    car.drive();

        Ford ford1 = new Ford();
        ford1.drive();
        ford1.accelerate();

        Car ford2 = new Ford();
        ford2.drive();
//    ford2.accelerate();

        System.out.println(ford1 instanceof Car);  // true
        System.out.println(ford1 instanceof Ford); // true
        System.out.println(ford2 instanceof Car);  // true
        System.out.println(ford2 instanceof Ford); // true

    }

}
