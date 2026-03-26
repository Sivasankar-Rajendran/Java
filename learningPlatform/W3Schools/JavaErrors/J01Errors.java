package W3Schools.JavaErrors;

import java.sql.Time;

public class J01Errors {
    public static void main(String[] args) {
        // Types of Errors in Java
        // 1) Compile-Time Error Detected by the compiler. Prevents code from running.
        // 2) Runtime Error Occurs while the program is running. Often causes crashes.
        // 3) Logical Error Code runs but gives incorrect results. Hardest to find.

        // Compile-Time Errors:
        // Compile-time errors occur when the program cannot compile due to syntax or
        // type issues.

        // a) Missing ;
        // int x = 5
        // System.out.println(x);
        // Here ';' is missing after 5
        // Error: Syntax error, insert ";" to complete BlockStatements

        // b) Undeclared Variables
        // System.out.println(myVar);
        // myVar is not defined
        // myVar cannot be resolved to a variable

    }

}
