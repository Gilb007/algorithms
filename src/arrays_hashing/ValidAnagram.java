package arrays_hashing;

/**
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

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
 Space Complexity: O(1), The space utilized by the counter array is constant.

 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
       if (s.length() != t.length()) return false;
       // создаем вектор для 26 где все нули
       int[] store = new int[26];
       // System.out.println(store);

        for (int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++; // если есть совпадение по букве плюсуем
            store[t.charAt(i) - 'a']--; // если нет совпадения по букве минусуем
        }

        // если есть хотя бы один НЕ ноль в векторе, то не анаграмма
        for (int n: store) {
            if (n != 0) {
                System.out.println("false");
                return false;
            }
        }

        System.out.println("true");
       return true;
    }
}