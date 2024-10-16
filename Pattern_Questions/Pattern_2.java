package Pattern_Questions;

// Q2. Print the pattern: (Hollow Rectangle)

/*

cell -> (i,j)

 **********
 *        *
 *        *
 *        *
 **********

 Here the logic is that 
 - first and last rows get printed
 - then the either i=1, j=1 and i=n, j=n gets printed
 */

import java.util.Scanner;

public class Pattern_2 {
    public static void main(String[] args) {
        System.out.println("Enter the dimensions of the ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == m || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
