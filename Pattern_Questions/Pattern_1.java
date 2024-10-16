package Pattern_Questions;

// Q1. Print the pattern:
/* 

*****
*****
*****
*****
*****

public class Patterns_one {
    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 15; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
*/

import java.util.Scanner;

public class Patterns_one {
    public static void main(String[] args) {
        System.out.println("Enter the dimensions of the pattern you want to create: ");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
