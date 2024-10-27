package OperatorExamples;

public class UnaryOperators {
    public static void main(String[] args) {
        int a = 5;

        // Pre-Increment
        System.out.println("Pre-Increment: " + (++a)); // Increments first, then uses the value

        // Post-Increment
        System.out.println("Post-Increment: " + (a++)); // Uses the value first, then increments
        System.out.println("Value after Post-Increment: " + a); // Shows updated value

        // Pre-Decrement
        System.out.println("Pre-Decrement: " + (--a)); // Decrements first, then uses the value

        // Post-Decrement
        System.out.println("Post-Decrement: " + (a--)); // Uses the value first, then decrements
        System.out.println("Value after Post-Decrement: " + a); // Shows updated value
    }
}
