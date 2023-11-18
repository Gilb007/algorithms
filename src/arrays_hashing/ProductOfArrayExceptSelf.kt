package arrays_hashing

/**
 * Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 *
 * You must write an algorithm that runs in O(n) time and without using the division operation.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,2,3,4]
 * Output: [24,12,8,6]
 * Example 2:
 *
 * Input: nums = [-1,1,0,-3,3]
 * Output: [0,0,9,0,0]
 *
 *
 * Constraints:
 *
 * 2 <= nums.length <= 105
 * -30 <= nums[i] <= 30
 *
 * The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * O(n) complexity, O(1) no memory
 */
fun main() {
    val nums = intArrayOf(1, 2, 3, 4)
    //o.p : 24, 12,8,6
}

fun productExceptSelf(nums: IntArray): IntArray {
    val res = IntArray(nums.size)

    var prefix = 1

    // слева направа закрываем пальцем
    for (i in 0 until nums.size) {
        res[i] = prefix
        prefix *= nums[i]
    }

    var postfix = 1
    for (i in nums.size - 1 downTo 0) {
        res[i] *= postfix
        postfix *= nums[i]
    }

    return res
}