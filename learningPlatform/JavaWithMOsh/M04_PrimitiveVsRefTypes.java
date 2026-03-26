package JavaWithMOsh;

import java.awt.*;

public class M04_PrimitiveVsRefTypes {
    public static void main(String[] args) {
        // primitive types are copied by their values
        // reference types are copied by their references

        byte x = 25;
        byte y = x;
        System.out.println(y);
        x = 30;
        System.out.println(y);
        // Answer is 25 not 30

        Point point1 = new Point(25, 40);
        System.out.println(point1);
        point1.x = 30;
        System.out.println(point1);
        // x value is 30 now

    }

}
