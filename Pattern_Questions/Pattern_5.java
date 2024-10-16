package Pattern_Questions;

/*
 Print the pattern:

 1
 12
 123
 1234
 12345
 123456
 
 */
import java.util.Scanner;

public class Pattern_5 {
    public static void main(String[] args) {
        System.out.println("Enter the numbers you want to print: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
