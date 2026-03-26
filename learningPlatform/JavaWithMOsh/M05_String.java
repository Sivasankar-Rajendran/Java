package JavaWithMOsh;

public class M05_String {
    public static void main(String[] args) {
        System.out.println("Hello! Enjoy your dinner.");

        String message1 = new String();
        message1 = "Hi";
        System.out.println(message1);

        // String or String literal = is the class comes with java.lang packge.
        // This package is automatically imported.
        // No need to use this way even String is belongs to References Type.
        // Use as below:

        String message2 = "Hello! Enjoy your dinner.";
        System.out.println(message2);
        System.out.println(message2.length());
        System.out.println(message2.toLowerCase());
        System.out.println(message2.toUpperCase());

        String message3 = "     Hello!  ";
        System.out.println(message3);
        System.out.println(message3.trim());

        String message4 = "First Name " + ": ";
        System.out.println(message4 + "Mike");

        String message5 = "First Name " + ": ";
        System.out.println(message5.endsWith(": "));
        // Answer will be true
        System.out.println(message5.endsWith("; "));
        // Answer will be false

        String message6 = "Peter is good boy.";
        System.out.println(message6.indexOf("P"));
        // indexOf will give when that coming very 1st time. Also, we can val
        // Answer will b 0
        System.out.println(message6.indexOf("r"));
        // Answer will b 4
        System.out.println(message6.indexOf("boy"));
        // Answer will b 14. Using this we can validate particular word is present or
        // not in the entire message.
        System.out.println(message6.indexOf("is"));
        // Answer will b 6
        System.out.println(message6.indexOf("a"));
        // Answer will be -1 since it's not present

        String message7 = "Elephant is big";
        System.out.println(message7.replace("big", "animal"));
        // Output will be "Elephant is animail"
        // replace method has 2 parameters called target and replament. big and animal
        // are called 'Arguments'.
        System.out.println(message7);
        // Output will be "Elephant is big". replace wont impact the original value.
        // Because in java Strings are immutable. We can't change it.

    }

}
