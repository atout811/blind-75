import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] arS = s.toCharArray();
        char[] arT = t.toCharArray();

        Arrays.sort(arS);
        Arrays.sort(arT);
        for (int i = 0; i < arT.length; i++) {
            if (arS[i] == arT[i])
                continue;
            else
                return false;
        }

        return true;

    }
}
