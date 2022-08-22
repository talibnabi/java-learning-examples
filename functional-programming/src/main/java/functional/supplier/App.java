package functional.supplier;

public class App {
    public static void main(String[] args) {
        String message = _Supplier.getMessage.get();
        _Supplier.getAllName.get().forEach(System.out::println);
        _Supplier.getGender.get().forEach(System.out::println);
        System.out.println(message);
    }
}
