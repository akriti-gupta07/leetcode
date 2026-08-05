class Solution {
    public int maxVowels(String s, int k) {

        char[] arr = {'a', 'e', 'i', 'o', 'u'};

        int vowel = 0;

        for (int i = 0; i < k; i++) {
            if (contains(arr, s.charAt(i))) {
                vowel++;
            }
        }

        int l = 0;
        int max = vowel;

        for (int r = k; r < s.length(); r++) {

            if (contains(arr, s.charAt(r))) {
                vowel++;
            }

            if (contains(arr, s.charAt(l))) {
                vowel--;
            }

            l++;
            max = Math.max(max, vowel);
        }

        return max;
    }

    private boolean contains(char[] arr, char target) {
        for (char c : arr) {
            if (c == target) {
                return true;
            }
        }
        return false;
    }
}