/**
 * Given an array of 2n integers, your task is to group these integers into n pairs of integer, say (a1, b1), (a2, b2), ..., (an, bn) which makes sum of min(ai, bi) for all i from 1 to n as large as possible.
 *
 *Example 1:
 *Input: [1,4,3,2]
 *
 *Output: 4
 *Explanation: n is 2, and the maximum sum of pairs is 4 = min(1, 2) + min(3, 4).
 *Note:
 *n is a positive integer, which is in the range of [1, 10000].
 *All the integers in the array will be in the range of [-10000, 10000].
 */
class Solution {
    public int arrayPairSum(int[] nums) {
        nums = sortAsc(nums);
        int size = nums.length;
        int result = 0;
        for (int i = 0; i < size; i = i + 2) {
            result += min(nums[i], nums[i + 1]);
        }
        return result;
    }
    
    /**
     * 冒泡排序，正序
     */
    private int[] sortAsc(int[] nums) {
        int size = nums.length;
        int median = 0;
        for (int i = 0; i < size; i++)
            for (int j = i + 1; j < size; j++) {
               if (nums[i] > nums[j]) {
                   median = nums[i];
                   nums[i] = nums[j];
                   nums[j] = median;
               } 
            }
        return nums;
    }
    
    /**
     * 大小比较
     */
    private  int min(int x, int y) {
        return x > y ? y : x;
    }
}
