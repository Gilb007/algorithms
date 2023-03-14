package arrays_hashing;

import java.util.Arrays;

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
public class ValidAnagram {
     public boolean isAnagram(String s, String t) {

         if (s.length() != t.length()) return false;

         int[] store = new int[26];

         for (int i = 0; i < s.length(); i++) {

             System.out.println(s.charAt(i) - 'a');
             store[s.charAt(i) - 'a']++;
             store[t.charAt(i) - 'a']--;
         }

         for (int n: store) {
             if(n != 0) {
                 return false;
             }
         }

         return true;
     }
}
