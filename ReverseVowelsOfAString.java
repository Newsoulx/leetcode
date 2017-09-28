/**
 *Write a function that takes a string as input and reverse only the vowels of a string.
 *
 *Example 1:
 *Given s = "hello", return "holle".
 *
 *Example 2:
 *Given s = "leetcode", return "leotcede".
 *
 *Note:
 *The vowels does not include the letter "y".
 */
class Solution {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
		char[] array = s.toCharArray();
		int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !vowels.contains(String.valueOf(array[start]))) start++;
            while (start < end && !vowels.contains(String.valueOf(array[end]))) end--;
            
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            
            start++;
            end--;
        }
		
		return String.valueOf(array);
    }
}
