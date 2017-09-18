/**
 *Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
 *
 *The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 *
 *You may assume that each input would have exactly one solution and you may not use the same element twice.
 *
 *Input: numbers={2, 7, 11, 15}, target=9
 *Output: index1=1, index2=2
 */
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            int temp = getTempLocation(target - numbers[i], numbers);
            if (temp >= 0) {
                result[0] = (target - numbers[i] > numbers[i]) ? i + 1 : temp + 1;
                result[1] = (target - numbers[i] > numbers[i]) ? temp + 1 : i + 1;
            } 
        }
        return result;
    }
    
    private int getTempLocation(int temp, int[] numbers) {
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            if (temp == numbers[i]) return i;
        }
        return -1;
    }
}

/**
 * a better method
 */
 class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int size = numbers.length;
        for (int i = 0; i < size; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[0] = (target - numbers[i] > numbers[i]) ? i + 1 : map.get(target - numbers[i]);
                result[1] = (target - numbers[i] > numbers[i]) ? map.get(target - numbers[i]) : i + 1;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }
}
