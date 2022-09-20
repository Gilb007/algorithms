package arrays_hashing;

import java.util.HashMap;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 *
 * Brute force: time = O(n^2), space = O(1)
 *
 * One pass: time = O(n), space = O(n)
 */

public class TwoSums {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            if (map.containsKey(nums[i])) {
                //System.out.println("prevMap.get(num) = "+prevMap.get(num));
                //System.out.println("i = "+i);
                return new int[]{map.get(nums[i]), i};
            }

            map.put(diff, i);
            System.out.println(map);
        }

        System.out.println(new int[]{});
        return new int[]{};

    }
}
