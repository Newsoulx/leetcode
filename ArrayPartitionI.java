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
