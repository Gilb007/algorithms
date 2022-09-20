package arrays_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *
 *
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 *
 * Complexity:
 * 1) O(m*(n*logn)) - m - количество слов, n - средняя длина слова
 * 2) O(m*(n*26)) - если взять способ группировки по вектору
 */

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if(strs.length==0) return res;
        HashMap<String, List<String>> map = new HashMap<>();
        for(String s: strs){
            char[] hash = new char[26];// hash = [0,0,...,0]
            //System.out.println(s.toCharArray());
            //System.out.println(s);
            for(char c: s.toCharArray()){
                hash[c-'a']++;
            }
            //System.out.println(hash);
            String key = new String(hash);
            //System.out.println(key);
            map.computeIfAbsent(key, k -> new ArrayList<>());
            System.out.println(map);
            map.get(key).add(s);
        }
        //System.out.println(map.values());
        res.addAll(map.values());
        //System.out.println(res);
        return res;
    }
}
