class Solution {
    public int hammingDistance(int x, int y) {
        int result = x ^ y;
        //String binaryResult = Integer.toBinaryString(result);
        //return binaryResult.length() - binaryResult.replace("1", "").length();
        //return binaryResult.replace("0", "").length();
        return Integer.bitCount(result);
    }
}
