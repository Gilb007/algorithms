import arrays_hashing.*;
import sliding_window.BestTimeToBuSellStock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStart {
    public static void main(String[] args) {
        //System.out.println("Hello world! Vlad");

        /**
         * Arrays & Hashing
         */
        //1
        //  ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        //  containsDuplicate.containsDuplicate(new int[]{1,2,3,4});

        //2
        // ValidAnagram validAnagram = new ValidAnagram();
        // validAnagram.isAnagram("anagram","nagaram");

        //3
        //TwoSums twoSums = new TwoSums();
        //twoSums.twoSum(new int[]{3,4,2}, 6);

        //4
        //GroupAnagrams groupAnagrams = new GroupAnagrams();
        //groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        //5
        //TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        //topKFrequentElements.topKFrequent(new int[]{1,1,1,2,2,2,3,4,4,4,4,4}, 2);

        //6
        //ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
        //productofArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4});

        //7 Valid Sudoku
            /*// A valid board.
            int [] [] board = {
                    {1, 4, 7, 0, 0, 0, 0, 0, 3},
                    {2, 5, 0, 0, 0, 1, 0, 0, 0},
                    {3, 0, 9, 0, 0, 0, 0, 0, 0},
                    {0, 8, 0, 0, 2, 0, 0, 0, 4},
                    {0, 0, 0, 4, 1, 0, 0, 2, 0},
                    {9, 0, 0, 0, 0, 0, 6, 0, 0},
                    {0, 0, 3, 0, 0, 0, 0, 0, 9},
                    {4, 0, 0, 0, 0, 2, 0, 0, 0},
                    {0, 0, 1, 0, 0, 8, 0, 0, 7},
            };
            print_board(board);
            valid_board(board);
            // An invalid board. The first row contains
            // repeated values.
            int [] [] board2 = {
                    {1, 4, 4, 0, 0, 0, 0, 0, 3},
                    {2, 5, 0, 0, 0, 1, 0, 0, 0},
                    {3, 0, 9, 0, 0, 0, 0, 0, 0},
                    {0, 8, 0, 0, 2, 0, 0, 0, 4},
                    {0, 0, 0, 4, 1, 0, 0, 2, 0},
                    {9, 0, 0, 0, 0, 0, 6, 0, 0},
                    {0, 0, 3, 0, 0, 0, 0, 0, 9},
                    {4, 0, 0, 0, 0, 2, 0, 0, 0},
                    {0, 0, 1, 0, 0, 8, 0, 0, 7},
            };
            print_board(board2);
            valid_board(board2);*/

        //8
        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        encodeAndDecodeStrings.encode(new String[] {"we", "say", ":", "yes"});
        encodeAndDecodeStrings.decode(encodeAndDecodeStrings.encode(new String[] {"we", "say", ":", "yes"}));


        //9
        //LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        //longestConsecutiveSequence.longestConsecutive(new int[]{100,4,200,1,3,2});

        /**
         * Sliding window
         */
        //BestTimeToBuSellStock bestTimeToBuSellStock = new BestTimeToBuSellStock();
        //bestTimeToBuSellStock.maxProfit(new int[]{7,1,5,3,6,4});

    }
}
