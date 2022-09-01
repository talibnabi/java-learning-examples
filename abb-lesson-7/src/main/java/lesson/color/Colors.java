package lesson.color;

import static lesson.color.Light.Red;

enum Light {
    Red, Green, Blue
}

enum Dark {
    Red, Green, Blue
}

public class Colors {
    public static void main(String[] args) {
        Light red = Red; // ??
        Dark red1 = Dark.Red;
        Light red2 = Red;
    }
}
