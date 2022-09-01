package lesson;

public class PassAppDynamic {
    int x;

    public PassAppDynamic(int x) {
        this.x = x;
    }

    public int add(int a, int b) {
        return a + b + x;
    }

    public static void main(String[] args) {
        PassAppDynamic app1 = new PassAppDynamic(10);
        PassAppDynamic app2 = new PassAppDynamic(20);

        int x1 = app1.add(1, 2);
        int x2 = app2.add(1, 2);
        System.out.println(x1); // 13
        System.out.println(x2); // 23
    }
}
