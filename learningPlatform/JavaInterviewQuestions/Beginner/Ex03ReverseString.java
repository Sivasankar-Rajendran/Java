package JavaInterviewQuestions.Beginner;

public class Ex03ReverseString {
    public static void main(String[] args) {
        String abc = "apple";
        String reversed = new StringBuilder(abc).reverse().toString();
        System.out.println(reversed);
    }
}