class Solution {
    public int climbStairs(int n) {
        int right = 1, left = 1;

        for (int i = 0; i < n - 1; i++) {
            int temp = left;
            left = right + left;
            right = temp;
        }

        return left;
    }

}