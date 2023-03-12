package two_pointers;

/**
 * You are given an integer array height of length n.
 * There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
 *
 * Find two lines that together with the x-axis form a container, such that the container contains the most water.
 *
 * Return the maximum amount of water a container can store.
 *
 * Notice that you may not slant the container.
 *
 * Example 1:
 *
 * Input: height = [1,8,6,2,5,4,8,3,7]
 * Output: 49
 * Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
 * Example 2:
 *
 * Input: height = [1,1]
 * Output: 1
 *
 *
 * Constraints:
 *
 * n == height.length
 * 2 <= n <= 105
 * 0 <= height[i] <= 104
 *
 *  Complexity: O(n)
 *  Time: O(1)
 */
public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int ans = 0;
        int res = 0;
        int left = 0;
        int right = heights.length - 1;

        while (left < right) {
            if (heights[left] <= heights[right]) {  // смотрим какая высота мин из двух текущих
                res = heights[left] * (right - left);
                left++;  // двигаем указатель left вправо
            } else {
                res = heights[right] * (right - left);
                right--; // двигаем указатель right влево
            }
            if (res > ans) ans = res; // берем макс
        }

        return ans;
    }
}
