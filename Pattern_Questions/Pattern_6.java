/*
Print the pattern:

12345
1234
123
12
1

 */
package Pattern_Questions;

import java.util.Scanner;

public class Pattern_6 {
    public static void main(String[] args) {
        System.out.println("Enter the number you need a pattern for: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
