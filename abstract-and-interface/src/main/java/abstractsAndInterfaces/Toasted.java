package abstractsAndInterfaces;

public interface Toasted extends LightlyFry, MuchFry {
    default void doSomething() {
        Integer lightlyFryDegree = this.lightlyFryDegree(10);
        Integer muchFryDegree = this.muchFryDegree(13);
        System.out.println(lightlyFryDegree);
        System.out.println(muchFryDegree);
    }
}
