package Methods_and_Functions;

import java.util.Scanner;

public class Add2Numbers {
    public static int calculateSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        System.out.println("Enter the two numbers you want to add: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int sum = calculateSum(a, b);
        System.out.println("The sum of the two numbers is: " + sum);

    }
}
