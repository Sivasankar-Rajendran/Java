package W3Schools;

import java.util.Scanner;

//Every Java program has a class name which must match the filename, and that every program must contain the main() method.

public class MyJavaFile1 {
    public static void main(String[] args) {

        // Printing Hello World
        System.out.println("Hello World");

        // Adding Two Numbers and Printing the answer
        // int a = 10;
        // int b = 20;
        // int c = a + b;
        // System.out.println(c);
        // System.out.println("The answer is: " + c);

        // Subtracting Two Numbers and Priting the answer
        // int a = 50;
        // int b = 100;
        // int c = a - b;
        // System.out.println("The answer is: " + c);

        // Multiplying Two Numbers and Printing the answer
        // int a = 50;
        // int b = 100;
        // int c = a * b;
        // System.out.println("The answer is: " + c);

        // Dividing Two Numbers and Printing the answer
        // int a = 200;
        // int b = 10;
        // int c = a / b;
        // System.out.println("The answer is: " + c);


        // int a = 200;
        // int b = 10;
        // int resultInt = a / b;
        // System.out.println("Integer division: " + a + " / " + b + " = " + resultInt);  // Output: 3





        Scanner scanner = new Scanner(System.in);

        // Input marks for each subject
        System.out.print("Enter marks for Tamil: ");
        int tamil = scanner.nextInt();

        System.out.print("Enter marks for English: ");
        int english = scanner.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = scanner.nextInt();

        System.out.print("Enter marks for Science: ");
        int science = scanner.nextInt();

        System.out.print("Enter marks for Social Science: ");
        int socialScience = scanner.nextInt();

        // Calculate total and average
        int total = tamil + english + maths + science + socialScience;
        double average = total / 5.0;

        // Print results
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);

        scanner.close();
    }
}