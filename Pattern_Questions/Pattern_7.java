package Pattern_Questions;

import java.util.Scanner;

public class Pattern_7 {
    public static void main(String[] args) {

        System.out.println("Enter the number you need a pattern for: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number = 1;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        sc.close();
    }
}
