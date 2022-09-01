package enums;

public final class Direction {

    private static final Direction EAST = new Direction(2, "east");
    private static final Direction WEST = new Direction(34, "west");
    private static final Direction NORTH = new Direction(43, "north");
    private static final Direction SOUTH = new Direction(41, "south");

    private final Integer directionLen;
    private final String direction;


    Direction(Integer directionLen, String direction) {
        this.directionLen = directionLen;
        this.direction = direction;
    }

    public Integer getDirectionLen() {
        return directionLen;
    }

    public String getDirection() {
        return direction;
    }

}
