package arrays_hashing

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
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
fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat")
    println(groupAnagrams(strs))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val res: HashMap<String, MutableList<String>> = hashMapOf()

    for (s in strs){
        // формирование битовой маски
        val count = IntArray(26)

        // получаем вектор 0, 1, 0, 0, 0...
        for (c in s){
            val index = c - 'a'
            count[index] += 1
        }

        // создаем ключ, если его нет и значение по нему list строк
        // если ключ уже есть, то добавляем нужную маску
        res[count.joinToString()] = res.getOrDefault(count.joinToString(), mutableListOf()).also { it.add(s) }
    }
    //по уникальному ключу добавляем значение
    return res.values.toList()
}