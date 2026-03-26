package JavaWithMOsh;

import java.util.Arrays;

public class M07_Arrays {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);

        // to store one value

        int[] numbers = new int[5]; // 5 - array length
        numbers[0] = 3;
        numbers[1] = 7;
        System.out.println(numbers); //This will through error
        System.out.println(Arrays.toString(numbers)); // This will show all 5 values [3, 7, 0, 0, 0]

        // since array is ref type we can use new.
        // But, we have short way to define an array.

        int[] meenkaMarks = { 90, 93, 98, 90, 91 };
        System.out.println(meenkaMarks[3]);
    }
}
