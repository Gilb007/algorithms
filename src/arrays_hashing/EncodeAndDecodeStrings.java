package arrays_hashing;

import java.util.ArrayList;
import java.util.List;

/**
 * Description
 * Design an algorithm to encode a list of strings to a string.
 * The encoded string is then sent over the network and is decoded back to the original list of strings.
 *
 * Please implement encode and decode
 *
 * Contact me on wechat to get Amazon、Google requent Interview questions . (wechat id : jiuzhang0607)
 *
 *
 * Example
 * Example1
 *
 * Input: ["lint","code","love","you"]
 * Output: ["lint","code","love","you"]
 * Explanation:
 * One possible encode method is: "lint:;code:;love:;you"
 * Example2
 *
 * Input: ["we", "say", ":", "yes"]
 * Output: ["we", "say", ":", "yes"]
 * Explanation:
 * One possible encode method is: "we:;say:;:::;yes"
 */

public class EncodeAndDecodeStrings {
    public String encode(String[] strs) {
        //System.out.println(strs[2]);
        StringBuilder encodedString = new StringBuilder();
        for (String str : strs) {
            encodedString.append(str.length()).append("#").append(str);
        }
        //System.out.println(encodedString);
        return encodedString.toString();
    }

    public List<String> decode(String str) {
        List<String> list = new ArrayList<>();
        System.out.println(str);
        int i = 0;
        while (i < str.length()) {
            int j = i;
            // ищем позицию #
            while (str.charAt(j) != '#') j++;
            //System.out.println("j = "+j);

            // длину до осмыслнного слова 2#
            int length = Integer.valueOf(str.substring(i, j));
            System.out.println(length);
            // позиция длины осмысленного слова
            i = j + 1 + length;
            // добавляем слово в list
            list.add(str.substring(j + 1, i));
            System.out.println(list);
        }
        //System.out.println(list);
        return list;
    }
}
