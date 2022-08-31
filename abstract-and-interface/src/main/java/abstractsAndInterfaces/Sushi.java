package abstractsAndInterfaces;

public class Sushi extends Meal {

    public Sushi(Integer count, Integer price) {
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

    @Override
    public Integer lightlyFryDegree(Integer degree) {
        return degree;
    }

    @Override
    public Integer muchFryDegree(Integer degree) {
        return degree;
    }
}
