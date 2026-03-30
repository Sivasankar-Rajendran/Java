package W3Schools.JavaTutorial;

public class Java07Variables {

    // Variables are containers for storing data values.

    // In Java, there are different types of variables, for example:

    // String - stores text, such as "Hello". String values are surrounded by double
    // quotes
    // int - stores integers (whole numbers), without decimals, such as 123 or -123
    // float - stores floating point numbers, with decimals, such as 19.99 or -19.99
    // char - stores single characters, such as 'a' or 'B'. Char values are
    // surrounded by single quotes
    // boolean - stores values with two states: true or false

    // Syntax
    // type variableName = value;

    // VARIABLES:

    public static void main(String[] args) {
        String name = "John";
        System.out.println(name);

        int myNum1 = 10;
        System.out.println(myNum1);

        int myNum2;
        myNum2 = 15;
        System.out.println(myNum2);

        int myNum3 = 15;
        myNum3 = 20; // myNum is now 20
        System.out.println(myNum3);

        final int myNum4 = 25;
        System.out.println(myNum4);
        // myNum4 = 20;
        // will generate an error: cannot assign a value to a final variable

        // PRINT VARIABLES:
        // To combine both text and a variable, use the + character:

        String name1 = "Mike";
        System.out.println("My name is : " + name1);
    }

}