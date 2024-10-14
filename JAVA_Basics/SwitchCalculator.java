import java.util.*;

public class SwitchCalculator {
    public static void main(String[] args) {
        System.out.println("Enter the operation you want to perform: ");
        Scanner sc = new Scanner(System.in);

        int opn = sc.nextInt();

        switch (opn) {

            case 1: {
                System.out.println("You've chosen to perform ADDITION!");
                System.out.println("Enter the two numbers you want to add: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                int sum = a + b;

                System.out.println("The sum of " + a + " + " + b + " is " + sum);

                break;
            }

            case 2: {
                System.out.println("You've chosen to perform SUBTRACTION!");
                System.out.println("Enter the two numbers you want to subtract: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                int diff = a - b;

                System.out.println("The difference of " + a + " - " + b + " is " + diff);

                break;
            }

            case 3: {
                System.out.println("You've chosen to perform MULTIPLICATION!");
                System.out.println("Enter the two numbers you want to multiply: ");
                int a = sc.nextInt();
                int b = sc.nextInt();

                int product = a * b;

                System.out.println("The product of " + a + " * " + b + " is " + product);

                break;
            }

            default: {
                System.out.println("Enter a valid choice!");
            }
        }

        sc.close();

    }

}
