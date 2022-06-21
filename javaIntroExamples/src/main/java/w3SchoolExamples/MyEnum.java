package w3SchoolExamples;

public enum MyEnum {
    //http://tutorials.jenkov.com/
    NAME("Nazmila"),
    SURNAME("Hasanova"),
    AGE("19");
    final String text;

    MyEnum(String text) {
        this.text = text;
    }
}
