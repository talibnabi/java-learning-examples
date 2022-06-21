package w3SchoolExamples;

public class Main {
    public static void main(String[] args) {
        //single-line comments
        /*multi-line comments*/
//        int myNum = 15;
//        System.out.println(myNum);
//
//        final int myNumSecond = 15;
//        System.out.println(myNumSecond);
//        //myNumSecond=90; error
//        int x = 456, y = 45, z = 76;
//        System.out.println(x + y + z);
//        int a, b, c;
//        a = b = c = 35;
//        System.out.println(a);
//        byte myNumByte = 100;
//        System.out.println(myNumByte);
//        float f1 = 35e3f;
//        double d1 = 12E4d;
//        System.out.println(f1);
//        System.out.println(d1);
//
//        char myVar1 = 65, myVar2 = 66, myVar3 = 67;
//        System.out.println(myVar1);
//        System.out.println(myVar2);
//        System.out.println(myVar3);
//        String name = "alisa";
//        System.out.println(name.charAt(3));
//        String ex1 = "python";
//        String ex2 = "python";
//        String ex3 = new String("python");
//        String ex4 = new String("python");
//        System.out.println("String hashcode: " + ex1.hashCode());
//        System.out.println("String hashcode: " + ex2.hashCode());
//        System.out.println("String hashcode: " + ex3.hashCode());
//        System.out.println("String hashcode: " + ex4.hashCode());
//        System.out.println(ex1.equals(ex2));
//        System.out.println(ex1.equals(ex3));
//        System.out.println(ex3.equals(ex4));
//        Integer i1 = 3;
//        Integer i2 = 3;
//        Integer i3 = new Integer(3);
//        System.out.println(i1.equals(i2));
//        System.out.println(i1.equals(i3));
//        System.out.println("UOK, \f BSc in MIT");//
//        System.out.println("Whatever you are, \f be a good one.");
//        double num = Math.random();
//        System.out.println(num);
//        int time = 20;
//        String result = (time < 18) ? "Good day." : "Good evening.";
//        System.out.println(result);


//
// Outputs "Looking forward to the Weekend"
        Country country = new Country();
        System.out.println(country.varOut);
        Country.CountryInner countryInner = country.new CountryInner();
        System.out.println(countryInner.varIn);
        Country.CountryInnerStatic countryInnerStatic = new Country.CountryInnerStatic();
        System.out.println(countryInnerStatic.varInSt);
    }
}
