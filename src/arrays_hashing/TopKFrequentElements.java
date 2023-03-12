package arrays_hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class TopKFrequentElements {
    public List<Integer> topKFrequent(int[] nums, int k) {

        // создаем массив бакетов
        List<Integer>[] bucket = new List[nums.length + 1];

        //System.out.println(bucket.length);

        //System.out.println(bucket.getClass());

        //  hashMap частотностей появления там элементов в массиве nums
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // new int[]{1,1,2,1,2,3,4,4,4,4,4}
        // вначале frequencyMap пустая {...}
        int i = 0;
        for (int n : nums) {
            //System.out.println(frequencyMap.getOrDefault(n, 0));
            // getOrDefault - если такой ключ есть, то берем его значение
            // если такого нет - default = 0.
            frequencyMap.put(n, frequencyMap.getOrDefault(n, 0) + 1);
            System.out.println(n+" = "+frequencyMap.getOrDefault(n, 0));
        }

        // System.out.println(frequencyMap); //=> {1=3, 2=2, 3=1, 4=5}
        //System.out.println(frequencyMap.keySet()); => [1, 2, 3, 4]
        // заполняем бакеты массивом строк, где индекс есть частотность,
        // а сами массивы из элеметов, которые столько раз появляются по индексу
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            //System.out.println(frequency);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
            //System.out.println(bucket.);
        }

        //System.out.println(bucket[5]);
        List<Integer> res = new ArrayList<>();

        // выбираем k самых частых элементов в nums
        // идем  с конца на начало
        for (int pos = bucket.length - 1; pos >= 0 && res.size() < k; pos--) {
            //System.out.println(bucket.length);
            if (bucket[pos] != null) {
                //System.out.println(bucket[pos]);
                res.addAll(bucket[pos]);
            }
            //System.out.println(res);
        }

        return res;
    }
}
