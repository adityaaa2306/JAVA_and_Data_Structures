package OperatorExamples;

public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5, b = 3;

        System.out.println("a & b: " + (a & b)); // Binary AND
        System.out.println("a | b: " + (a | b)); // Binary OR
        System.out.println("a ^ b: " + (a ^ b)); // Binary XOR
        System.out.println("~a: " + (~a)); // Binary Ones Complement
        System.out.println("a << 1: " + (a << 1)); // Binary Left Shift
        System.out.println("a >> 1: " + (a >> 1)); // Binary Right Shift
    }
}
