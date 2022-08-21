import java.util.HashMap;

class solution {
    public static int[] sol() {
        int[] nums = { 3, 3 };
        int target = 6;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]))
                return new int[] { map.get(nums[i]), i };

            map.put(target - nums[i], i);

        }

        return new int[] {};
    }

    public static void main(String[] args) {
        sol();
    }
}
