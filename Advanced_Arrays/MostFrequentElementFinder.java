package Advanced_Arrays;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentElementFinder {

    public static int findMostFrequent(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        int mostFrequent = nums[0];
        int maxCount = 0;

        for (int num : nums) {
            int count = frequencyMap.getOrDefault(num, 0) + 1;
            frequencyMap.put(num, count);

            if (count > maxCount) {
                maxCount = count;
                mostFrequent = num;
            }
        }

        return mostFrequent;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 3, 4, 3, 5 };
        System.out.println("Most frequent element: " + findMostFrequent(nums)); // Output: 3
    }
}
