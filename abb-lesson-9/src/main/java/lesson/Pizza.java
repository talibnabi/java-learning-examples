package lesson;

import java.util.Arrays;
import java.util.Objects;

public class Pizza {
    public final int size;
    public final String name;
    public final String[] extras;
    //... more fields

    // without 'public' it's accessible only in lesson9
    public Pizza(int size, String name, String... extras) {
        this.size = size;
        this.name = name;
        this.extras = extras;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pizza pizza = (Pizza) o;
        /**
         * at first,
         *  - we need to compare the small fields which are easier to compare
         *  - we need to compare fields which is likely to be different
         *  age: 20 - 60 = 40 of them
         *  names = hundreds of them
         */
        return size == pizza.size
                && Objects.equals(name, pizza.name)
                && Arrays.equals(extras, pizza.extras);
    }
    @Override
    public int hashCode() {
        int result = Objects.hash(size, name);
        result = 31 * result + Arrays.hashCode(extras);
        return result;
    }

    @Override
    public String toString() {
        return String.format("Pizza : %d : %s", size, name);
    }

}
