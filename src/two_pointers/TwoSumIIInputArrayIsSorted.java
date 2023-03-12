package two_pointers;

import java.util.ArrayList;
import java.util.List;

/**
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
 * find two numbers such that they add up to a specific target number.
 * Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 *
 * Return the indices of the two numbers, index1 and index2,
 * added by one as an integer array [index1, index2] of length 2.
 *
 * The tests are generated such that there is exactly one solution.
 * You may not use the same element twice.
 *
 * Your solution must use only constant extra space.
 *
 * Time: O(n)
 * Space: O(1)
 */

public class TwoSumIIInputArrayIsSorted {
    public int[] twoSumArraySorted(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;

        while (array[left] + array[right] != target) {

            if (array[left] + array[right] > target) {
                right--;
            } else  {
                left++;
            }

        }

        return new int[]{left, right};

    }
}
