/**
 *Given an array of integers, every element appears twice except for one. Find that single one.
 *
 *Note:
 *Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                 map.put(num, 1);
            }
        }
        
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if ((Integer) entry.getValue() == 1) return (Integer) entry.getKey();
        }
        
        return 0;
    }
}
