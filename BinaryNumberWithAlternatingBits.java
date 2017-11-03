/**
 *Given a positive integer, check whether it has alternating bits: namely, if two adjacent bits will always have different values.
 */
class Solution {
    public boolean hasAlternatingBits(int n) {
        String binary = Integer.toBinaryString(n);
        char[] c = binary.toCharArray();
        char compare = '2';
        for (char temp : c) {
            if (temp == compare) return false;
            compare = temp;
        }
        return true;
    }
}
