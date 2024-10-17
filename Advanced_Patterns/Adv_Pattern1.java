/* 

Q. Print the pattern:

*             *
* *         * * 
* * *     * * *
* * * * * * * *     // Here, n  = 4
* * * * * * * *
* * *     * * *
* *         * *
*             *

*/

package Advanced_Patterns;

import java.util.Scanner;

public class Adv_Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Half
        for (int i = n; i >= 1; i--) {
            // 1st part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            // spaces
            int spaces = 2 * (n - i);
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }

            // 2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        sc.close();
    }
}
