package abstracts;

public class Pizza extends Meal {

    public Pizza(Integer count, Integer price) {
        super(count, price);
    }

    @Override
    protected Integer addPrice(Integer addPrice) {
        return this.getPrice() + addPrice;
    }

    @Override
    protected Integer addCount(Integer addCount) {
        return this.getCount() + addCount;
    }

}
