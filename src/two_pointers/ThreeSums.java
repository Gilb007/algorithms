package two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 *
 * Notice that the solution set must not contain duplicate triplets.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 * Example 2:
 *
 * Input: nums = [0,1,1]
 * Output: []
 * Explanation: The only possible triplet does not sum up to 0.
 * Example 3:
 *
 * Input: nums = [0,0,0]
 * Output: [[0,0,0]]
 * Explanation: The only possible triplet sums up to 0.
 *
 *
 * Constraints:
 *
 * 3 <= nums.length <= 3000
 * -105 <= nums[i] <= 105
 *
 * Time: O(n*logn) + O(n^2) = O(n^2), O(n*logn) - сложность сортировки, O(n^2) - два цикла, чтобы пройти триплет
 * Space: O(1), or O(n) - если берем с сортировкой.
 */

public class ThreeSums {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3)
            return new ArrayList<>();

        List<List<Integer>> ans = new ArrayList<>();

        // заранее отсортировали
        Arrays.sort(nums);

        // идем по циклу до тех пор пока число элементов не меньше 3х
        for (int i = 0; i + 2 < nums.length; ++i) {
            // если следующий элемент тот же самый, что и предыдущий
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Choose nums[i] as the first num in the triplet,
            // and search the remaining nums in [i + 1, n - 1]
            int l = i + 1;
            int r = nums.length - 1;
            while (l < r) {
                final int sum = nums[i] + nums[l] + nums[r];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[l++], nums[r--]));
                    // пропускаем повторяющиеся слева
                    while (l < r && nums[l] == nums[l - 1])
                        ++l;
                    // пропускаем повторяющиеся справа
                    while (l < r && nums[r] == nums[r + 1])
                        --r;
                } else if (sum < 0) {
                    ++l;
                } else {
                    --r;
                }
            }
        }

        return ans;
    }

}
