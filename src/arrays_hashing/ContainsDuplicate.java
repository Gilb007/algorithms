package arrays_hashing;

import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,1]
 * Output: true
 *
 * Example 2:
 *
 * Input: nums = [1,2,3,4]
 * Output: false
 *
 * Example 3:
 *
 * Input: nums = [1,1,1,3,3,4,3,2,4,2]
 * Output: true
 *
 * brute force: time = O(n^2), space = O(1)
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> uniques = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (uniques.contains(nums[i])) {
                System.out.println("true");
                return true;
            }
            uniques.add(nums[i]);
        }
        System.out.println("false");
        return false;

    }
}
/**
 * добавлем HasSet и добавляем уникальные элементы,
 * если в Set встретился еще один, то говорим true
 * time = O(n), space = O(n) - дополнительное место для хранения uniques (HashSet)
 */
