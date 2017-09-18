/**
 *Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
 *
 *You may assume that the array is non-empty and the majority element always exist in the array.
 */
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                int times = map.get(num) + 1;
                map.put(num, times);
            } else {
                map.put(num, 1);
            }
        }
        
        int maxCount = Collections.max(map.values());
        
        int result = 0;
        for (Map.Entry entry : map.entrySet()){
            if (maxCount == (int) entry.getValue()) {
                result = (int) entry.getKey();
            }
        }
        
        return result;
    }
}
