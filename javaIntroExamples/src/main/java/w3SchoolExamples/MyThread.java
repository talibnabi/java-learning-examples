package w3SchoolExamples;


public class MyThread extends Thread {
    public static int amount = 0;

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        while (myThread.isAlive()) {
            System.out.println(amount);
        }
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }

    @Override
    public void run() {
        amount++;
    }

}
