package arrays_hashing;

import java.util.HashSet;

/**
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 *
 * You must write an algorithm that runs in O(n) time.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
 * Example 2:
 *
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 *
 *
 * Constraints:
 *
 * 0 <= nums.length <= 105
 * -109 <= nums[i] <= 109
 */

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        // глобальный макс.
        int ans = 1;

        // добавили все в set
        for (int num : nums) set.add(num);

        System.out.println(set);
        for (int num : nums) {

            System.out.println("num = "+num);

            // если нет (num-1), то текущий элемент есть начало проверки алгоритма на возростающую последоватлельность
            // на начало последовательности (чтобы не было повторений)
            // {1,3,2,100,4,200}
            if (!set.contains(num - 1)) {
                //System.out.println(num-1);
                // счетчик локального макс.
                int count = 1;
                //  до тех пор пока справа есть +1
                while (set.contains(num + 1)) {
                    //System.out.println(num+1);
                    num++;
                    count++;
                }
                System.out.println("лок num = "+num);
                ans = Math.max(count, ans);
            }
        }
        System.out.println(ans);
        return ans;
    }
}
