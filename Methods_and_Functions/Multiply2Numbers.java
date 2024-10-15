package Methods_and_Functions;

import java.util.Scanner;

public class Multiply2Numbers {
    public static int calculateProduct(int a, int b) {
        int product = a * b;
        return product;
    }

    public static void main(String[] args) {
        System.out.println("Enter the two numbers you want to multiply: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = calculateProduct(a, b);

        System.out.println("The product of the two numbers is: " + product);
        sc.close();
    }
}
