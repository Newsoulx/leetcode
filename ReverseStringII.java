class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder result = new StringBuilder();
        int length = s.length();
        int size = (int) Math.ceil((double) length/ (double) k);
        int next = 0;
        for (int i = 1; i <= size; i++) {
            String temp;
            int tempSize;
            if (i % 2 == 0) {
                if (next + k > length) {
                    tempSize = length;
                } else {
                    tempSize = next + k;
                }
                temp = s.substring(next, tempSize);
            } else {
                if (next + k > length) {
                    tempSize = length;
                } else {
                    tempSize = next + k;
                }
                temp = new StringBuilder(s.substring(next, tempSize)).reverse().toString();
            }
            result.append(temp);
            next = next + k;
        }
        return result.toString();
    }
}
