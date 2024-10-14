// for loop
// while loop
// do while loop

/* 
public class Loops {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
*/

/*
public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i++;
        }
    }
}


public class Loops {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println("Aditya");
            i++;
        } while (i < 11);
    }
} */

// Calculate the sum of first n numbers:

/* int sum=0;

for(int i=0;i<=n;i++){
    sum = sum+i;
    }


import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        System.out.println("Enter the n numbers you want to add: ");
        int sum = 0;

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }

        System.out.println("The sum of first " + " numbers is " + sum);

        sc.close();
    }
}
*/

// Print the table of a number input by the user

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("Enter the number you want the table for: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " * " + i + " = " + i * n);
        }
        sc.close();
    }
}
