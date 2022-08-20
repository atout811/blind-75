class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0, r = height.length - 1;

        while (l < r) {
            int space = 0;
            if (height[l] < height[r]) {
                space = (r - l) * height[l];
            } else {
                space = (r - l) * height[r];
            }
            max = Math.max(max, space);

            if (height[l] < height[r]) {
                l++;

            } else {
                r--;

            }

        }

        return max;
    }
}