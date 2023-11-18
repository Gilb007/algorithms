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
class Codec {
    // Encodes a list of strings to a single string.
    fun encode(strs: List<String>): String {
        var res = ""
        strs.forEach{
            res = res + it.length + "#" + it
        }
        return res
    }

    // Decodes a single string to a list of strings.
    fun decode(s: String): List<String> {
        var (res, i) = Pair(mutableListOf<String>(), 0)

        while (i < s.length){
            var j = i
            while (s[j] != '#') {
                j++
            }
            val lengthOfWord = s.subSequence(i, j).toString().toInt()

            val (wordStart, wordEnd) = Pair(j+1, j+1+lengthOfWord)
            res.add(s.subSequence(wordStart, wordEnd).toString())

            i = wordEnd

        }
        return res

    }
}

fun main(){
    val encodeAndDecodeStrings = Codec()
    println(encodeAndDecodeStrings.encode(listOf("we", "say", ":", "yes")))
}
/**
 * Your Codec object will be instantiated and called as such:
 * var obj = Codec()
 * val s = obj.encode(strs)
 * val ans = obj.decode(s)
 */