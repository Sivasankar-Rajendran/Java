package W3Schools.JavaTutorial;

public class JavaIfElse {

    // Java If ... Else
    // Java Conditions and If Statements

    // Less than: a < b
    // Less than or equal to: a <= b
    // Greater than: a > b
    // Greater than or equal to: a >= b
    // Equal to a == b
    // Not Equal to: a != b

    // Java has the following conditional statements:

    // Use if to specify a block of code to be executed, if a specified condition is
    // true
    // Use else to specify a block of code to be executed, if the same condition is
    // false
    // Use else if to specify a new condition to test, if the first condition is
    // false
    // Use switch to specify many alternative blocks of code to be executed

    public static void main(String[] args) {
        // The if Statement (if is case sensitive)
        // Syntax:
        // if (condition) {
        //     // block of code to be executed if the condition is true
        //   }
          
        int a = 30;
        int b = 20;
        if (a > b) {
            System.out.println(a + " is big number when comparing to " + b);
        }


        // The else Statement
        // Syntax:
        // if (condition) {
        //     // block of code to be executed if the condition is true
        //   } else {
        //     // block of code to be executed if the condition is false
        //   }

        int c = 30;
        int d = 200;
        if (c > d) {
            System.out.println(c + " is big number when comparing to " + d);
        } else {
            System.out.println(c + " is not a big number when comparing to " + d);
        }


        // The if else Statement
        // Syntax:
        // if (condition1) {
        //     // block of code to be executed if condition1 is true
        //   } else if (condition2) {
        //     // block of code to be executed if the condition1 is false and condition2 is true
        //   } else {
        //     // block of code to be executed if the condition1 is false and condition2 is false
        //   }

        int e = 150;
        int f = 150;
        if (e>f) {
            System.out.println(e + " is big number when comparing to " + f);
        }
        else if (e==f) {
            System.out.println(e + " is equal to " + f);
        }
        else {
            System.out.println(e + " is not a big number when comparing to " + f);
        }
    }

}
