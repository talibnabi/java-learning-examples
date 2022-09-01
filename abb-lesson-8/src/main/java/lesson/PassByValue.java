package lesson;

public class PassByValue {
    public int add(int a, int b) {
        int r = a + b;
        a = 10;
        b = 20;
        return r;
    }
    public void doSomething() {
        int q = 1;
        int w = 2;
        int x = add(q, w);
        System.out.println(x); // 3
        System.out.println(q); // 1
        System.out.println(w); // 2
    }

    public static void main(String[] args) {
        PassByValue app = new PassByValue();
        app.doSomething();
    }

}
