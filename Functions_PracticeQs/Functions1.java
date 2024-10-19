package Functions_PracticeQs;

// Enter 3 numbers from the user & make a function to print their average.

import java.util.Scanner;

public class Functions1 {

    public static int printAverage(int m, int n) {
        int average = (m + n) / 2;
        return average;
    }

    public static void main(String[] args) {
        System.out.println("Enter the first number of your choice: ");
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        System.out.println("Enter the second number of your choice: ");
        int n = sc.nextInt();

        sc.close();

        int average = printAverage(m, n);

        System.out.println("The average is: " + average);
    }
}