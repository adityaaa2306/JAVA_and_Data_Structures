package Advanced_Arrays;

import java.util.Arrays;

public class ArrayRotator {

    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // Adjust k to ensure it’s within the bounds of the array length

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        rotate(nums, 2);
        System.out.println("Array after rotation: " + Arrays.toString(nums)); // Output: [4, 5, 1, 2, 3]
    }
}
