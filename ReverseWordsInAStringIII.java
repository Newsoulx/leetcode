/**
 * Given a string, you need to reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
 *
 *Example 1:
 *Input: "Let's take LeetCode contest"
 *Output: "s'teL ekat edoCteeL tsetnoc"
 *Note: In the string, each word is separated by single space and there will not be any extra space in the string.
 */
class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder result = new StringBuilder();
        for(String key : word) {
            result.append(new StringBuilder(key).reverse().toString()).append(" ");
        }
        return result.substring(0, result.length() - 1);
    }
}
