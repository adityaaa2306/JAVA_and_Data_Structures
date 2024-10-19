// Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. x^n.

package Functions_PracticeQs;

import java.util.Scanner;

public class Function8 {
    public static double power(int x, int n) {
        return Math.pow(x, n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base number and exponent: ");
        int x = sc.nextInt();
        int n = sc.nextInt();

        sc.close();

        System.out.println(x + " raised to the power of " + n + " is: " + power(x, n));
    }

}
