/*
Print the pattern:

1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

visualise this pattern in the form of a matrix.

assume n=5, hence 5*5 matrix

        1st col 2nd col 3rd col 4th col 5th col
1st row    1
2nd row    0       1
3rd row    1       0       1
4th row    0       1       0       1
5th row    1       0       1       0       1

here, (1,1) = 1, (2,1) = 0, (2,2) = 1, (3,1) = 1,and so on...
thus, when (i+j)=even, 1 is printed.
and when (i+j)=odd, 0 is printed.

*/

package Pattern_Questions;

import java.util.Scanner;

public class Pattern_8 {
    public static void main(String[] args) {

        System.out.println("Enter the number you need a pattern for: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
