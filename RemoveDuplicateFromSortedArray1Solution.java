// 26, Remove Duplicate From Sorted Array - I
// https://leetcode.com/problems/remove-duplicates-from-sorted-array/
// Time Complexity : O(n), As we parse through the whole Array
// Space Complexity :  O(1), we didn't create any extra space, so O(1)
// Technique Used: Two Pointers
// Did this code successfully run on Leetcode for the First time: Yes
// Did you get the logic without checking the solution: Yes
// Revisit Count: 0
// This problem got referred from: 80, Remove Duplicates for Sorted Array-II
// This problem has reference of : 27, Remove Element 

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray1Solution {
    public int[] removeDuplicates(int[] nums) {

        if (nums.length == 1) {
            return nums;
        }

        int count = 1, i = 1, j = 1;

        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count == 1) {
                nums[j] = nums[i];
                j++;
            }
            i++;
        }

        return Arrays.copyOfRange(nums, 0, j);
    }

    public static void main(String[] args) {
        RemoveDuplicateFromSortedArray1Solution RDFSAS = new RemoveDuplicateFromSortedArray1Solution();
        int[] nums = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Output: " + Arrays.toString(RDFSAS.removeDuplicates(nums)));
    }
}