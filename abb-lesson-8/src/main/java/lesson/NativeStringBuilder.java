package lesson;

import java.util.Arrays;
import java.util.Locale;

public class NativeStringBuilder {
    private String[] data = new String[2];
    private int pointer;

    public void append(String s) {
        data[pointer++] = s;
    }

    @Override
    public String toString() {
        // know the total length
        int len = 0;
        for (int i = 0; i < data.length; i++) {
            len += data[i].length();
        }
        // allocate the memory
        char[] composed = new char[len];
        System.out.println(Arrays.toString(composed).toLowerCase(Locale.ROOT));
        // copy
        // create new string from array;
        String newString = new String(composed);
        // return
        return newString;
    }

    public static void main(String[] args) {
//        NativeStringBuilder nativeStringBuilder=new NativeStringBuilder();
//        nativeStringBuilder.append("alisa");
//        nativeStringBuilder.append("aslan");
//        System.out.println(nativeStringBuilder.toString().length());
        char[] element = new char[3];
        element[0] = '3';
        element[1] = '2';
        element[2] = '3';
        String text = new String(element);
        System.out.println(text);
    }

}
