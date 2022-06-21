package w3SchoolExamples;

public class MyEnumSecond {
    public String text;
    public final static MyEnumSecond EAST = new MyEnumSecond("EAST");
    public final static MyEnumSecond WEST = new MyEnumSecond("WEST");
    public final static MyEnumSecond NORTH = new MyEnumSecond("NORTH");
    public final static MyEnumSecond SOUTH = new MyEnumSecond("SOUTH");

    public MyEnumSecond(String text) {
        this.text = text;
    }
}
