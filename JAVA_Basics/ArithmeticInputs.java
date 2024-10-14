
// From the java.util package, import the Scanner class for taking inputs
import java.util.Scanner;

/*
public class ArithmeticInputs {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers of your choice: ");
        Scanner sc = new Scanner(System.in);

        // Perform basic addition with two inputs
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println("The sum of the two digits is: " + sum);

        sc.close();

    }
}

public class ArithmeticInputs {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers you want to multiply: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = a * b;

        System.out.println("The product of the two numbers is: " + product);

        sc.close();

    }
}
*/

public class ArithmeticInputs {
    public static void main(String[] args) {
        System.out.println("Enter the two numbers you want to subtract (num1>num2): ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = a - b;

        System.out.println("The difference between the two numbers is: " + diff);

        sc.close();
    }
}