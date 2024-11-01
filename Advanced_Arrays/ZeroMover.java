package Advanced_Arrays;

import java.util.Arrays;

public class ZeroMover {

    public static void moveZerosToEnd(int[] nums) {
        int index = 0; // Keeps track of the position to insert non-zero elements

        for (int num : nums) {
            if (num != 0) {
                nums[index++] = num;
            }
        }

        // Fill the rest of the array with zeros
        while (index < nums.length) {
            nums[index++] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 };
        moveZerosToEnd(nums);
        System.out.println("Array after moving zeros: " + Arrays.toString(nums)); // Output: [1, 3, 12, 0, 0]
    }
}
