class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1Freq = new int[26];
        int[] s2Freq = new int[26];

        // Initialize frequency arrays
        for (int i = 0; i < s1.length(); i++) {
            s1Freq[s1.charAt(i) - 'a']++;
            s2Freq[s2.charAt(i) - 'a']++;
        }

        int left = 0;
        int right = s1.length();

        // Sliding window
        while (right < s2.length()) {
            if (Arrays.equals(s1Freq, s2Freq)) return true;

            // Add new char at right
            s2Freq[s2.charAt(right) - 'a']++;
            // Remove old char at left
            s2Freq[s2.charAt(left) - 'a']--;
            left++;
            right++;
        }

        // Final check for last window
        return Arrays.equals(s1Freq, s2Freq);
    }
}
