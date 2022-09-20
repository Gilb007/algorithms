import arrays_hashing.*;

public class MainStart {
    public static void main(String[] args) {
        //System.out.println("Hello world! Vlad");

        /**
         * Arrays & Hashing
         */
       //1  ContainsDuplicate containsDuplicate = new ContainsDuplicate();
       //1  containsDuplicate.containsDuplicate(new int[]{1,2,3,4});

        //2 ValidAnagram validAnagram = new ValidAnagram();
        //2 validAnagram.isAnagram("anagram","nagaram");

        TwoSums twoSums = new TwoSums();
        twoSums.twoSum(new int[]{3,4,2}, 6);

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        //TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        //topKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,3}, 2);

    }
}
