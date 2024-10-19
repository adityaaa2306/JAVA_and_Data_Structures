package Functions_PracticeQs;

import java.util.Scanner;

public class Functions2 {
    public static int sumOfnNumbers(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the second number of your choice: ");
        int n = sc.nextInt();

        sc.close();

        int sum = sumOfnNumbers(n);

        System.out.println("The sum of n numbers is: " + sum);
    }

}
