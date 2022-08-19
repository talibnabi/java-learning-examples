package functional;

public class People {
    private final String name;
    private final Gender gender;

    public People(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}
