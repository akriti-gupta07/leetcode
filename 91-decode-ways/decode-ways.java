class Solution {
    public int numDecodings(String s) {
        if (s == null || s.length() == 0 || s.charAt(0) == '0') {
            return 0;
        }

        int n = s.length();
        int[] arr = new int[n];

        arr[0] = 1;

        for (int i = 1; i < n; i++) {
            // Decode the current digit individually
            if (s.charAt(i) != '0') {
                arr[i] = arr[i - 1];
            }

            // Decode the current and previous digits together
            int x = (s.charAt(i - 1) - '0') * 10
                    + (s.charAt(i) - '0');

            if (x >= 10 && x <= 26) {
                arr[i] += (i >= 2) ? arr[i - 2] : 1;
            }

            // No valid decoding is possible
            if (arr[i] == 0) {
                return 0;
            }
        }

        return arr[n - 1];
    }
}