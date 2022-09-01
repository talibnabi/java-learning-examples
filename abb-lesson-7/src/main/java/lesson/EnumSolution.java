package lesson;

import lesson.color.Color;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.chrono.IsoEra;

public class EnumSolution {
    DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
    Month month = LocalDate.now().getMonth();
    IsoEra era = LocalDate.now().getEra();
    public static void doSomething(Color color) {
        switch (color) {
            case Red:    //...
            case Yellow: //...
            case Green:  //...
        }
    }

    public static void main(String[] args) {
        doSomething(Color.Red);    // +
        doSomething(Color.Yellow);  // +
        doSomething(Color.Green); // +
        // that will not compile anymore
//    doSomething(YELLOW); // +/-
//    doSomething(blue);   // --
//    doSomething(Yelow);  // --
    }

}
