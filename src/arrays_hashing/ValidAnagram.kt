package arrays_hashing

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
typically using all the original letters exactly once.

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true
Example 2:

Input: s = "rat", t = "car"
Output: false

Complexity Analysis - Sorting

Time Complexity: O(n log n)
Space Complexity: O(n)

Complexity Analysis - Hashing

Time Complexity: O(n) = O(s+t)
Space Complexity: O(1), The space utilized by the counter array is constant. // хотя вроде создали store

 */
class ValidAnagram {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) return false

        // битовая маска из нулей
        val arr = Array(26) {0}
        for (i in s.indices) {
            arr[s[i] - 'a']++
            arr[t[i] - 'a']--
        }

        // если есть хотя бы один ноль в массиве 0/1,
        // то не анаграмма. анаграмма => [0, 0, 0, 0, ..., 0]
        return arr.all { it == 0 }
    }
}