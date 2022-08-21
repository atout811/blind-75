import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> sol = new ArrayList<>();
        List<Integer> indices = new ArrayList<>();
        HashMap<String, ArrayList<Integer>> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] sortedString = strs[i].toCharArray();
            Arrays.sort(sortedString);
            if (map.containsKey(String.valueOf(sortedString))) {
                map.get(String.valueOf(sortedString)).add(i);
            } else {
                int finalI = i;
                map.put(String.valueOf(sortedString), new ArrayList<Integer>() {
                    {
                        add(finalI);
                    }
                });
            }
        }

        for (var entry : map.entrySet()) {
            List<String> s = entry.getValue().stream().map(index -> strs[index]).collect(Collectors.toList());
            sol.add(s);
        }

        return sol;

    }
}