package main;


public class Pair<K, V> {
    K key;
    V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public static <A, B> Pair<A, B> of(A key, B value) {
        return new Pair<>(key, value);
    }
}
