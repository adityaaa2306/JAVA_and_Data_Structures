// Take an array as input from the user. Search for a given number x and print the index at which it occurs

package Arryas_Introduction;

import java.util.Scanner;

public class ArrayQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();

        System.out.println("Enter the number you want to search in the array: ");
        int num = sc.nextInt();

        int numbers[] = new int[size];

        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        for (int i = 0; i < size; i++) {
            if (num == numbers[i]) {
                System.out.println(numbers[i] + " is present in the array at index " + i);
            }
        }

        sc.close();
    }
}
