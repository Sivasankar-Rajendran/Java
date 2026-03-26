package W3Schools.JavaTutorial;

public class JavaSwitch {

    public static void main(String[] args) {
        int a = 1;
        switch (a) {
            case 1:
                System.out.println("I am Sunday");
                break;

            case 2:
                System.out.println("I am Monday");
                break;

            case 3:
                System.out.println("I am Tuesday");
                break;

            case 4:
                System.out.println("I am Wednesday");
                break;

            case 5:
                System.out.println("I am Thursday");
                break;

            case 6:
                System.out.println("I am Friday");
                break;

            case 7:
                System.out.println("I am Saturday");
                break;

            default:
                System.out.println("Your input is out of range");
                break;
        }
    }

}

// This is how it works:

// The switch expression is evaluated once.
// The value of the expression is compared with the values of each case.
// If there is a match, the associated block of code is executed.
// The break and default keywords are optional


// The break Keyword

// When Java reaches a break keyword, it breaks out of the switch block.
// This will stop the execution of more code and case testing inside the block.
// When a match is found, and the job is done, it's time for a break. There is no need for more testing.
// A break can save a lot of execution time because it "ignores" the execution of all the rest of the code in the switch block.
// If the default statement is used as the last statement in a switch block, it does not need a break.


