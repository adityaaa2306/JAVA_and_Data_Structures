/*
The basic syntax for a fuction is java is:

public static returnType functionName(type arg1, type arg2...)

public static int calculateAge(int age, int years){
    // operations
    }
 */
package Methods_and_Functions;

import java.util.Scanner;

public class FunctionIntro {
    // Write a function to print your name.
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static void main(String[] args) {
        System.out.println("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        sc.close();

        System.out.println("Your name is: ");
        printMyName(name);
    }

}
