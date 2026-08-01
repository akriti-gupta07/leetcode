import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> output = new ArrayList<>();

        if (s.length() < p.length()) {
            return output;
        }

        int[] l1 = new int[26];
        int[] l2 = new int[26];

        // Initial window
        for (int i = 0; i < p.length(); i++) {
            l1[p.charAt(i) - 'a']++;
            l2[s.charAt(i) - 'a']++;
        }

        if (Arrays.equals(l1, l2)) {
            output.add(0);
        }

        // Sliding window
        for (int j = 0; j < s.length() - p.length(); j++) {
            l2[s.charAt(j) - 'a']--;
            l2[s.charAt(j + p.length()) - 'a']++;

            if (Arrays.equals(l1, l2)) {
                output.add(j + 1);
            }
        }

        return output;
    }
}