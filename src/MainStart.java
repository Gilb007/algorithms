import arrays_hashing.*;
import sliding_window.BestTimeToBuSellStock;
import two_pointers.ContainerWithMostWater;
import two_pointers.ThreeSums;
import two_pointers.TwoSumIIInputArrayIsSorted;
import two_pointers.ValidPalindrome;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainStart {
    public static void main(String[] args) {

        //4
        //GroupAnagrams groupAnagrams = new GroupAnagrams();
        //groupAnagrams.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        //5
        //TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        //topKFrequentElements.topKFrequent(new int[]{1,1,2,1,2,2,3,4,4,4,4,4}, 2);

        //6
        //ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
        //productofArrayExceptSelf.productExceptSelf(new int[]{1,2,3,4});

        //7 Valid Sudoku
            // A valid board.
        /*ValidSudoku validSudoku = new ValidSudoku();
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
            };*/

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

        //validSudoku.valid_row(3, board);
        //validSudoku.valid_col(5,board);
        //validSudoku.print_board(board);



        //9
        //LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        //longestConsecutiveSequence.longestConsecutive(new int[]{1,3,2,100,4,200});

        /**
         * Tow pointers
         */

        //1
        //ValidPalindrome validPalindrome = new ValidPalindrome();
        //System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));

        //2
        //TwoSumIIInputArrayIsSorted twoSumIIInputArrayIsSorted = new TwoSumIIInputArrayIsSorted();
        //System.out.println(Arrays.toString(twoSumIIInputArrayIsSorted.twoSumArraySorted(new int[]{2,3,4}, 6)));
        //System.out.println(Arrays.toString(twoSumIIInputArrayIsSorted.twoSumArraySorted(new int[]{2,7,11,15}, 13)));
        //System.out.println(Arrays.toString(twoSumIIInputArrayIsSorted.twoSumArraySorted(new int[]{-1,0}, -1)));

        //3
        //ThreeSums threeSums = new ThreeSums();
        //System.out.println(threeSums.threeSum(new int[]{-1,0,1,2,-1,-4}));

        //4
        //ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        //System.out.println(containerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));

        //5

        /**
         * Sliding window
         */
        //BestTimeToBuSellStock bestTimeToBuSellStock = new BestTimeToBuSellStock();
        //bestTimeToBuSellStock.maxProfit(new int[]{7,1,5,3,6,4});

    }
}

