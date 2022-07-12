// Problem Name: 27, Remove Element
// Link: https://leetcode.com/problems/remove-element/
// Time Complexity : O(n), As we parse through the whole Array
// Space Complexity : O(1), we didn't create any extra space, so O(1)
// Technique Used: Two Pointers
// Did this code successfully run on Leetcode for the First time: Yes
// Did you get the logic without checking the solution: Yes
// Revisit Count: 0
// This problem got referred from: 26
// This problem has reference of : 203, 283

import java.util.Arrays;

public class RemoveElementSolution {
    public int[] removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        // We'll have two Pointers, i and j
        // we'll loop until i reaches to the last element of the array

        // always pointer i increments irrespective of the target val is present at that
        // current index
        // If the current value is equal to the target value, we'll halt the pointer j
        // position at that index only and increment pointer i
        // If the current value is NOT equal to the target value, we'll replace that
        // element with the element where j is halted, where pointer j is halted before
        // at the target value

        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        return Arrays.copyOfRange(nums, 0, j);
    }

    public static void main(String[] args) {
        RemoveElementSolution RES = new RemoveElementSolution();
        int[] nums = { 0, 1, 2, 2, 3, 0, 4, 2 };
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(RES.removeElement(nums, 2)));
    }
}
