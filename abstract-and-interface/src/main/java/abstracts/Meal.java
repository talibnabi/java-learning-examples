package abstracts;

public abstract class Meal {
    private final Integer count;
    private final Integer price;

    public Meal(Integer count, Integer price) {
        this.count = count;
        this.price = price;
    }

    protected abstract Integer addPrice(Integer addPrice);

    protected abstract Integer addCount(Integer addCount);

    protected void getCountAndPrice() {
        System.out.println("count: " + this.getCount());
        System.out.println("price: " + this.getPrice());
    }
    public Integer getCount() {
        return count;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "count=" + count +
                ", price=" + price +
                '}';
    }
}
