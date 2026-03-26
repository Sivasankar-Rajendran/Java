package JavaWithMOsh;

import java.util.Date;

public class M03_ReferencesTypes {

    public static void main(String[] args) {
        byte age = 45;
        System.out.println(age);

        Date currentDate = new Date();

        // Date = is the class
        // java.util = is the package
        // new = is the operator
        // currentDate is called objects or intances of the Date class

        currentDate.getTime();
        currentDate.hashCode();
        currentDate.after(currentDate);

        // Here getTime, hashCode or after are called methods or members of Date class.
        // methods will be dispalyed after . operator
        // primitive types wont have methods

        System.out.println(currentDate);
        // System = is the class
        // out = is the another class
        // println = is the method;

    }
}