import java.util.Scanner;

/* 
public class ConditionalStatements {
    public static void main(String[] args) {
        // Check if the given number is EVEN or ODD
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("The number is EVEN!");
        } else {
            System.out.println("The number is ODD!");
        }
        sc.close();
    }
}


// Check if two numbers are greater, lesser, or equal

public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Enter the 2 numbers you want to compare: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b) {
            System.out.println("The numbers are EQUAL.");
        }

        else if (a > b) {
            System.out.println(a + " is greater than " + b);

        }

        else {
            System.out.println(b + " is greater than " + a);

        }
        sc.close();
    }
}
*/

// Greet the user with Namaste, if the input number is 1, Hello for 2 and Bonjour for 3.

public class ConditionalStatements {
    public static void main(String[] args) {
        System.out.println("Enter a number (1 or 2 or 3): ");
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (num == 1)
            System.out.println("Namaste");

        else if (num == 2)
            System.out.println("Hello");

        else if (num == 3)
            System.out.println("Bonjour");

        else
            System.out.println("Enter number within the given range!");

        sc.close();
    }

}