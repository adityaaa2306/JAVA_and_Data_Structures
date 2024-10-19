package Functions_PracticeQs;

import java.util.Scanner;

public class VotingEligibility {
    public static boolean isEligibleToVote(int age) {
        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        sc.close();

        System.out.println("Is eligible to vote: " + isEligibleToVote(age));
    }
}
