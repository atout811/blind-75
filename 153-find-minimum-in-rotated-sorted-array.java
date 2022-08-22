class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length - 1, mid = 0;

        while (l <= r) {
            if (nums[l] <= nums[r])
                return nums[l];

            mid = (r + l) / 2;

            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }

        }

        return 0;

    }
}