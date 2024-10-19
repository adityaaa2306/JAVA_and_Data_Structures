package Functions_PracticeQs;

import java.util.Scanner;

public class CircumferenceOfCircle {
    public static double circumferenceOfCircle(double radius) {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        sc.close();

        System.out.println("The circumference of the circle is: " + circumferenceOfCircle(radius));
    }
}
