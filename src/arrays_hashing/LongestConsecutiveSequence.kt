package arrays_hashing

import java.lang.Integer.max

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
 *
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

class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        if (nums.size == 1) return 1
        val hashSet = HashSet<Int>()


        // добавили все в set
        nums.forEach { hashSet.add(it) }

        var longestSize = 0
        var isNumberStartOfSequence: Boolean
        for (num in nums) {

            // если нет (num-1), то текущий элемент есть начало проверки
            // алгоритма на возростающую последовательность
            // на начало последовательности (чтобы не было повторений)
            // {1,3,2,100,4,200}
            isNumberStartOfSequence = !hashSet.contains(num - 1)
            if (isNumberStartOfSequence) {
                var nextConsecutiveNumber = num + 1

                // счетчик локального макс.
                var currentSize = 1

                //  до тех пор пока справа есть +1
                while (hashSet.contains(nextConsecutiveNumber)) {
                    nextConsecutiveNumber++
                    currentSize++
                }
                longestSize = max(longestSize, currentSize)
            }
        }
        return longestSize
    }
}
