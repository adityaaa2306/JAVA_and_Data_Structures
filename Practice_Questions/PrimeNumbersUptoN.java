package Practice_Questions;

import java.util.ArrayList;
import java.util.List;

public class PrimeNumbersUptoN {
    public static List<Integer> findPrimes(int n) {
        List<Integer> primes = new ArrayList<>();
        if (n < 2)
            return primes;

        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++)
            isPrime[i] = true;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i])
                primes.add(i);
        }
        return primes;
    }

    public static void main(String[] args) {
        int n = 20;
        System.out.println("Prime numbers up to " + n + ": " + findPrimes(n));
    }
}
