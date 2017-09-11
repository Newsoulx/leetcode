/**
 * M[i] => M[n/i][n%i] Will it result in right mapping? Take some example and check this formulae.
 */
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int size = nums.length;
        int length = nums[0].length;
        if (r * c != size * length) {
            return nums;
        } else {
            int[][] result = new int[r][c];
            int j = r * c;
            for (int i = 0; i < j; i++) {
                result[i/c][i%c] = nums[i/length][i%length];
            }
            return result;
        }
    }
}
