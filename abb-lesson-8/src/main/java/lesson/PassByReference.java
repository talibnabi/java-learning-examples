package lesson;

class Box {
    int value;

    public Box(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value +
                '}';
    }
}

public class PassByReference {
    public int add(Box box1, Box box2) {
        int r = box1.value + box2.value;
        box1.value = 10;
        box2.value = 20;
        return r;
    }

    public void doSomething() {
        Box q = new Box(1);
        Box w = new Box(2);
        int x = add(q, w);
        System.out.println(x);
        System.out.println(q);
        System.out.println(w);
    }

    public static void main(String[] args) {
        PassByReference app = new PassByReference();
        app.doSomething();
    }

}
