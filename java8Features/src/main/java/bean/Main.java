package bean;

import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //example_1();
        //example_2();
        //example_3();
        //example_4();
        //example_5();
        //example_6();
        //example_7();
        //example_8();
        //example_9();
        //findWithStreamSecond(List.of("Alisa"), "Alisa");
        //example_10();
        //example_11();
        //example_12();
        //example_13();
        //example_14();
        //example_15();
        //example_16();
        //example_17();
        //example_18();
        //example_19();
        //example_20();
        //example_21();
        //example_22();
        //example_23();
        //example_24();
        example_25();
    }

    public static void example_1() {
        //lambda expressions
        List<String> words = Arrays.asList(
                "Alisa", "Simon", "Eliza"
        );
        MyAnonymConsumer myAnonymConsumer = new MyAnonymConsumer();
        for (String word : words) {
            myAnonymConsumer.accept(word);
        }
    }

    public static void example_2() {
        //lambda expressions
        List<String> words = Arrays.asList(
                "Alisa", "Simon", "Eliza"
        );
        words.forEach(System.out::println);
    }

    public static void example_3() {
        //lambda expressions
        List<String> words = Arrays.asList(
                "Alisa", "Simon", "Eliza"
        );
        words.forEach((word) -> System.out.println(word));
    }

    public static void example_4() {
        //lambda expressions
        List<String> words = Arrays.asList(
                "Alisa", "Simon", "Eliza"
        );
        words.forEach((String word) -> System.out.println(word));
    }

    public static void example_5() {
        //lambda expressions
        List<String> words = Arrays.asList(
                "Alisa", "Simon", "Eliza"
        );
        AtomicInteger count = new AtomicInteger();
        words.forEach((word) -> {
            count.getAndIncrement();
            System.out.println("word " + count + ":");
            System.out.println(word);
        });
    }

    public static void foo(String s) {
        System.out.println(s);
    }

    public static Optional<String> find(List<String> words, String wordTest) {
        for (String word : words) {
            if (word.equalsIgnoreCase(wordTest)) {
                return Optional.of(word);
            }
        }
        return Optional.empty();
    }

    public static Optional<String> findWithStream(List<String> words, String wordTest) {
        return words.stream().filter((word) -> word.equalsIgnoreCase(wordTest)).findFirst();
    }

    public static void findWithStreamSecond(List<String> words, String wordTest) {
        Stream<String> stream = words.stream();
        Stream<String> stream1 = stream.filter((word) -> word.equalsIgnoreCase("Alisa"));
        Optional<String> optional = stream1.findFirst();
        optional.ifPresent(System.out::println);
    }

    public static void example_9() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        Optional<String> optional = findWithStream(words, "Alisa");
        System.out.println(optional.get());
    }

    public static void example_6() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        find(words, "Alisa").ifPresent(System.out::println);
    }

    public static void example_7() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        Optional<String> optional = find(words, "Simon");
        if (optional.isPresent()) {
            String word = optional.get();
            if (word.equalsIgnoreCase("Simon")) {
                System.out.println(word);
            }
        }
    }

    public static void example_8() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        find(words, "Alisa").ifPresent(Main::foo);
    }

    public static void example_10() {
        Stream.of("Alisa", "Simon")
                .filter((word) -> word.equalsIgnoreCase("Simon"))
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void example_11() {
        //multithreading
        Arrays.asList("Alisa", "Amina", "Simon")
                .parallelStream()
                .filter((word) -> word.equalsIgnoreCase("Simon"))
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void example_12() {
        //multithreading
        Arrays.asList("Alisa", "Amina", "Simon")
                .parallelStream()
                .filter((word) -> word.equalsIgnoreCase("Simon"))
                .findAny()
                .ifPresent(System.out::println);
    }

    public static void example_13() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        words.stream().map(String::toUpperCase).toList().forEach(System.out::println);
    }

    public static void example_14() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        List<String> wordList = words.stream()
                .map((word) -> word + " 'unknown surname'")
                .collect(Collectors.toList());
        wordList.stream().filter((word) -> word.contains("Alisa"))
                .findFirst()
                .ifPresent(System.out::println);
    }

    public static void example_15() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        words.stream().map((word) -> {
                    word = word + " 'unknown surname'";
                    word = word.toUpperCase(Locale.ROOT);
                    return word;
                }).toList()
                .forEach(System.out::println);
    }

    public static void example_16() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        String result = words.stream()
                .filter((word) -> word.equalsIgnoreCase("Aminsa"))
                .findAny()
                .orElse("'not found'");
        System.out.println(result);
    }

    public static void example_17() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        String result = words.stream()
                .filter((word) -> word.equalsIgnoreCase("Aminsa"))
                .findAny()
                .orElseThrow(() -> new IllegalArgumentException("Not Found"));
        System.out.println(result);
    }

    public static void example_18() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        int sum = words.stream().mapToInt(String::length).sum();
        System.out.println(sum);
    }

    public static void example_19() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        int sum = words.stream().map(String::length).reduce(0, Integer::sum);
        System.out.println(sum);
    }

    public static void example_20() {
        List<String> words = Arrays.asList("Alisa", "Amina", "Simon");
        int mul = words.stream().map(String::length).reduce(1, (num1, num2) -> num1 * num2);
        System.out.println(mul);
    }

    public static void example_21() {
        List<List<String>> words = Arrays.asList(
                Arrays.asList("Alisa", "Simon", "Nubar"),
                Arrays.asList("Amin", "Tuna", "Semi"),
                Arrays.asList("Gonzales", "Baccio", "Aselsa")
        );
        int result = words.stream()
                .flatMap(Collection::stream)
                .mapToInt(String::length)
                .sum();
        System.out.println(result);
    }

    public static void example_22() {
        List<List<String>> words = Arrays.asList(
                Arrays.asList("Alisa", "Simon", "Nubar"),
                Arrays.asList("Amin", "Tuna", "Semi"),
                Arrays.asList("Gonzales", "Baccio", "Aselsa")
        );
        List<List<Integer>> listx = words.stream()
                .map((list) -> list.stream().map(String::length))
                .map((stream) -> stream.collect(Collectors.toList()))
                .toList();
        System.out.println(listx.stream().flatMap(Collection::stream).toList());
    }

    public static void example_23() {
        List<List<String>> words = Arrays.asList(
                Arrays.asList("Alisa", "Simon", "Nubar"),
                Arrays.asList("Amin", "Tuna", "Semi"),
                Arrays.asList("Gonzales", "Baccio", "Aselsa")
        );
        List<Integer> list = words.stream()
                .flatMap(Collection::stream)
                .mapToInt(String::length)
                .boxed()
                .toList();
        System.out.println(list);
    }

    public static void example_24() {
        List<List<String>> words = Arrays.asList(
                Arrays.asList("Alisa", "Simon", "Nubar"),
                Arrays.asList("Amin", "Tuna", "Semi"),
                Arrays.asList("Gonzales", "Baccio", "Aselsa")
        );
        List<Integer> listx = words.stream()
                .flatMap((list) -> list.stream().map(String::length))
                .toList();
        System.out.println(listx);
    }

    public static void example_25() {
        //intermediate and terminal operation
        /*
        Intermediate Operations :

        map(), filter(), distinct(), sorted(), limit(), skip()

        Terminal Operations :

        forEach(), toArray(), reduce(),
         collect(), min(), max(), count(), anyMatch(),
         allMatch(), noneMatch(), findFirst(), findAny()
        * */
    }

}
