package JavaInterviewQuestions.Beginner;

import java.util.Scanner;

public class Ex00TempWorking {

    public static void main(String[] args) {
        System.out.println(Math.sqrt(64));
        Scanner temp = new Scanner(System.in);

        int a = temp.nextInt();

        System.out.println("Total Numbers to be added: " + a);

        int number1 = temp.nextInt();
        int number2 = temp.nextInt();

        int Total = number1 + number2;
        System.out.println(Total);

        double average = Total / 2;
        System.out.println(average);
    }
}