package arrays_hashing

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *hash table
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
 * One pass:
 * time = O(n), // раз проходимся по массиву
 * space = O(n) // доп. память для хранения (хешмап)
 */

//{3,4,2}, target = 6.

class TwoSums {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val prevMap: HashMap<Int, Int> = HashMap()
        for (i in nums.indices) {
            val num = nums[i]
            val diff = target - num
            if (prevMap.containsKey(diff)) {
                return intArrayOf(prevMap[diff]!!, i)
            }
            prevMap[num] = i
        }
        // no solution
        return intArrayOf()
    }
}

fun main() {
    val result = TwoSums().twoSum(intArrayOf(2, 7, 11, 15), 9)
    println(result.contentToString())
}