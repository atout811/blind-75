class Solution {
    public boolean isPalindrome(String s) {
        String text = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        if (text.length() == 0)
            return true;
        int right = (text.length() - 1);
        int left = 0;
        while (right > left) {
            if (text.charAt(left) == text.charAt(right)) {

                right--;
                left++;
                continue;
            }

            else {
                return false;

            }
        }
        return true;

    }
}