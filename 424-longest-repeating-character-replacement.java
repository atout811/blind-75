class Solution {
    public int characterReplacement(String s, int k) {
        int[] map = new int[26];
        int start = 0, maxCount = 0, maxLength = 0;
        for (int end = 0; end < s.length(); end++) {
            maxCount = Math.max(maxCount, ++map[s.charAt(end) - 'A']);
            while (end - start + 1 - maxCount > k) {
                map[s.charAt(start) - 'A']--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
}