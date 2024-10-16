/*
Print the pattern:
            *
           **
          ***
         ****
        *****
*/
package Pattern_Questions;

import java.util.Scanner;

public class Pattern_4 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n for the pattern: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();

    }
}
