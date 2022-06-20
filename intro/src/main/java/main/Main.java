package main;

public class Main {
    public static void main(String[] args) {
        //ctrl+space
        System.out.println("Hello World");
        String internetButton = "Internet Section";
        System.out.println(internetButton);
        //camelCase
        //Don't repeat yourself
        int dollarYesterday = 0;
        double dollarYesterdaySecond = 8.15;
        double dollarToday = 8.15;
        //byte 0-2554
        byte byt = 13;
        long l = 495954455;
        System.out.println(l);
        System.out.println(byt);
        boolean down = true;
        boolean upper = false;
        //boundary analysis
        if (dollarToday < dollarYesterdaySecond) {
            System.out.println("Dollar felt.");
        } else if (dollarToday > dollarYesterdaySecond) {
            System.out.println("Dollar rose.");
        } else {
            System.out.println("Dollar equal.");
        }
        String fastCredit1 = "Fast credit";
        String fastFastCredit2 = "Fast credit2";
        System.out.println(fastCredit1);
        System.out.println(fastFastCredit2);
        String arr[] = {fastCredit1, fastFastCredit2};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + ".x");
        }
        System.out.println(arr.length);
        String[] arr2 = new String[3];
        System.out.println(arr2.length);
        arr2[0] = fastCredit1;
        arr2[1] = fastFastCredit2;
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + " ..ended.");
        }
        for (int i = 0; i < 10; System.out.println("a")) {
            i++;
        }
        String[] credits = {
                "First credit",
                "Second credit",
                "Third credit."
        };
        for (int i = 0; i < credits.length; i++) {
            System.out.println(credits[i]);
        }
        //for each
        for (String credit : credits) {
            System.out.println(credit);
        }


        //value types and reference types  (stack and heap)
        int a = 10;
        int b = 20;
        a = b;
        b = 100;
        System.out.println(a);
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums2 = {10, 20, 30, 40, 50};
        nums = nums2;
        nums2[0] = 100;
        System.out.println(nums[0]);
        //garbage collector
        //int,boolean,float,double,byte,enum are value types  array,class,interface,abstract class are reference types
        String state1 = "Paris";
        String state2 = "Baku";
        state1 = state2;
        state2="Moscow";
        System.out.println(state1);
    }
}
