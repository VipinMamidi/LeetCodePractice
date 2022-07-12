
// Problem Name: 283, Move Zeroes
// Link: https://leetcode.com/problems/move-zeroes/
// Time Complexity : O(n), As we parse through the whole Array
// Space Complexity : O(1), we didn't create any extra space, so O(1)
// Technique Used: Two Pointers
// Did this code successfully run on Leetcode for the First time: Yes
// Did you get the logic without checking the solution: Yes
// Revisit Count: 0
// This problem got referred from: 27
// This problem has reference of : EOL

import java.util.Arrays;

public class MoveZeroesSolution283 {
    public int[] moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }

        // We'll have two Pointers, i and j
        // we'll loop until i reaches to the last element of the array
        int i = 0, j = 0;
        // always pointer i increments irrespective of whether the current element is 0
        // or not
        // If Current element is 0 then j pointer halts there and i increments
        // If the current element is NOT 0, then wherever the i pointer is at it will
        // replace with j pointer, as it is at value 0 and
        // we'll replace the value at pointer i with 0,
        // in short we'll swap 0 at pointer j with non-zero value at pointer i
        // we'll do the swap only if both the pointers are not at same position, as if
        // they both are at same //position then there is not point in swapping, it will
        // be o only when [1]
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
            i++;
        }
        return nums;
    }

    public static void main(String[] args) {
        MoveZeroesSolution283 mzs = new MoveZeroesSolution283();
        int[] nums = { 0, 1, 0, 3, 12 };
        System.out.println("Input1: " + Arrays.toString(nums));
        System.out.println("Output1: " + Arrays.toString(mzs.moveZeroes(nums)));

        nums = new int[1];
        System.out.println("Input2: " + Arrays.toString(nums));
        System.out.println("Output2: " + Arrays.toString(mzs.moveZeroes(nums)));

        nums = new int[1];
        nums[0] = 1;
        System.out.println("Input3: " + Arrays.toString(nums));
        System.out.println("Output3: " + Arrays.toString(mzs.moveZeroes(nums)));

        nums = new int[2];
        nums[0] = 0;
        nums[1] = 1;
        System.out.println("Input4: " + Arrays.toString(nums));
        System.out.println("Output4: " + Arrays.toString(mzs.moveZeroes(nums)));
    }
}
