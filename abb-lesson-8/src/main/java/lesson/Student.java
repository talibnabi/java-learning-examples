package lesson;

public class Student {
    String name;
    static int count;

    static {
        System.out.println("called once");
    }

     {
        count++;
    }

    public Student(String name) {
        this.name = name;
        System.out.println("new student is created");
    }

    public static void main(String[] args) {
        new Student("alex");
        new Student("jim");
        new Student("bim");
        System.out.println(count);
    }

}
