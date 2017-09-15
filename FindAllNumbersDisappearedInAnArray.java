/**
 *Given an array of integers where 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.
 *
 *Find all the elements of [1, n] inclusive that do not appear in this array.
 *
 *Could you do it without extra space and in O(n) runtime? You may assume the returned list does not count as extra space.
 *
 *Example:
 *
 *Input:
 *[4,3,2,7,8,2,3,1]
 *
 *Output:
 *[5,6]
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> last = new ArrayList<>();
        int size = nums.length;
        for(int i = 0; i <= size; i++) {
            if (i < size) list.add(nums[i]);
            if (i > 0) last.add(i);
        }
        last.removeAll(list);
        return last;
    }
}

/**
 * better method
 */
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int size = nums.length;
        Arrays.sort(nums);
        for(int i = 1; i <= size; i++) {
           if (Arrays.binarySearch(nums, i) < 0) list.add(i);
        }
        return list;
    }
}
