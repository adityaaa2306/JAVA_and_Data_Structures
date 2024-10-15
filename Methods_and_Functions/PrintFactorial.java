package Methods_and_Functions;

import java.util.Scanner;

public class PrintFactorial {
    public static void printFactorial(int n) {
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the factorial for: ");
        int n = sc.nextInt();

        printFactorial(n);
        System.out.println("The factorial is: ");

        sc.close();
    }
}
