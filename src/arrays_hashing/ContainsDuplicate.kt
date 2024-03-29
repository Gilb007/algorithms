package arrays_hashing

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
class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
            //дополнительное место для хранения uniques (HashSet)
            val uniques = HashSet<Int>()

            for (e in nums) {
                if (uniques.contains(e)) return true
                else uniques.add(e)
            }
            return false
    }
    // add - Adds the specified element to this set if it is not already present.

}
/**
 * добавлем HasSet и добавляем уникальные элементы,
 * если в Set встретился еще один, то говорим true
 * time = O(n), space = O(n) - дополнительное место для хранения uniques (HashSet)
 */
fun main() {
    val containsDuplicate = ContainsDuplicate()
    val arr = intArrayOf(4, 6, 8, 3, 4, 4, 96)
    println(containsDuplicate.containsDuplicate(arr))
}