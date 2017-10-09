/**
 *iven two binary strings, return their sum (also a binary string).
 *
 *For example,
 *a = "11"
 *b = "1"
 *Return "100".
 */
class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, k = 0;
        while (i >= 0 || j >= 0) {
            int sum = k;
            if (j >= 0) sum += b.charAt(j--) - '0';
            if (i >= 0) sum += a.charAt(i--) - '0';
            sb.append(sum % 2);
            k = sum / 2;
        }
        if (k != 0) sb.append(k);
        return sb.reverse().toString();
    }
}
