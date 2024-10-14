// The Scanner class provides a simple way to read different types of inputs (like integers, strings, etc.) from the console.
// import java.util.*; for all classes in the java.util package

// and java.util.Scanner imports only the Scanner package
import java.util.Scanner;

/* 
public class InputBasics {
    public static void main(String[] args) {
        /*
         * Scanner sc = new Scanner(System.in);
         * String name = sc.next();
         * System.out.println(name);
         

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello, " + name);

        sc.close();
    }
}
*/

public class InputBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age > 18) {
            System.out.println("You are eligible for driving.");
        } else {
            System.out.println("You are not eligible for driving.");
        }

        sc.close();
    }

}

/*
 * Key Scanner Methods:
 * - nextLine(): Reads a full line of text (including spaces).
 * - next(): Reads a single word (delimited by space).
 * - nextInt(): Reads an integer.
 * - nextDouble(): Reads a double (floating-point number).
 * - nextBoolean(): Reads a boolean (true or false).
 */