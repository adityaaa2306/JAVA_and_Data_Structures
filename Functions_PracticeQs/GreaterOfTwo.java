package Functions_PracticeQs;

import java.util.Scanner;

public class GreaterOfTwo {
    public static int greaterOfTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        sc.close();

        System.out.println("The greater number is: " + greaterOfTwo(num1, num2));
    }
}
