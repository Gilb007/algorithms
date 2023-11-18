package arrays_hashing

/**
 * Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.
 *
 * Example 1:
 *
 * Input: nums = [1,1,1,2,2,3], k = 2
 * Output: [1,2]
 * Example 2:
 *
 * Input: nums = [1], k = 1
 * Output: [1]
 *
 * Constraints:
 *
 * 1 <= nums.length <= 105
 * k is in the range [1, the number of unique elements in the array].
 * It is guaranteed that the answer is unique.
 *
 * Follow up: Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 *
 * Java Time O(n) Solution - Bucket Sort
 */
fun main() {
    val nums = intArrayOf(1, 1, 1, 1, 2, 2, 3)
    topKFrequent(nums, 2).forEach {
        print(it)
    }
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    // создаем массив бакетов
    val res = mutableListOf<Int>()

    //  hashMap частотностей появления
    //  там элементов в массиве nums
    val count = hashMapOf<Int, Int>()

    val freq = MutableList<MutableList<Int>>(nums.size + 1) {
        mutableListOf()
    }

    // new int[]{1,1,2,1,2,3,4,4,4,4,4}
    // вначале frequencyMap пустая {...}
    for (n in nums) {
        // getOrDefault - если такой ключ есть, то берем его значение
        // если такого нет - default = 0.
        count[n] = count.getOrDefault(n, 0) + 1
    }

    // System.out.println(frequencyMap); //=> {1=3, 2=2, 3=1, 4=5}
    //System.out.println(frequencyMap.keySet()); => [1, 2, 3, 4]
    // заполняем бакеты массивом строк, где индекс есть частотность,
    // а сами массивы из элеметов, которые столько раз появляются по индексу
    for ((n, c) in count) {
        freq[c].add(n)
    }

    // выбираем k самых частых элементов в nums
    // идем  с конца на начало
    for (i in freq.size - 1 downTo 0) {
        for (n in freq[i]) {
            res.add(n)
            if (res.size == k) {
                return res.toIntArray()
            }
        }
    }

    return intArrayOf()
}