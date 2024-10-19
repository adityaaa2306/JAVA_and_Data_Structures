// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered. 

package Functions_PracticeQs;

import java.util.Scanner;

public class Functions7 {
    public static void countNumbers() {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;
        String choice;

        do {
            System.out.println("Enter a number: ");
            int number = sc.nextInt();
            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            System.out.println("Do you want to enter another number? (y/n): ");
            choice = sc.next();
        } while (choice.equalsIgnoreCase("y"));

        sc.close();
        System.out.println("Count of Positive numbers: " + positiveCount);
        System.out.println("Count of Negative numbers: " + negativeCount);
        System.out.println("Count of Zeros: " + zeroCount);
    }

    public static void main(String[] args) {
        countNumbers();
    }
}
