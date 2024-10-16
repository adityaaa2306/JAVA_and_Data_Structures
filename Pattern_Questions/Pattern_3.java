package Pattern_Questions;

// Q3. Print the Pattern

/*
 * 
 **
 ***
 ****
 *****

 for(int i=1 ; i<=n ; i++){
    for (int j=1; j=i; j++){
        sout("*")
        }
        sout();
}
 

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {

        System.out.println("Enter the number of rows in the pattern: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("The pattern is as follows: ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}


// // Q4. Print the Pattern

/*

 *****
 ****
 ***
 **
 *

 

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the pattern: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("The pattern is as follows: ");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}

*/

// // Q4. Print the Pattern

/*

     *
    ** 
   ***
  ****
 *****

 */

import java.util.Scanner;

public class Pattern_3 {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows in the pattern: ");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows: ");
        int n = sc.nextInt();

        System.out.println("The pattern is as follows: ");
        for (int i = n; i >= 1; i++) {
            for (int j = i; j >= 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}