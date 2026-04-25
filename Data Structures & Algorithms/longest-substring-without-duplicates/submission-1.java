class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =  0, right = 0, maxLen = 0;
        Set<Character> sub = new HashSet<>();
        while(right<s.length()){
            char c = s.charAt(right);
            while(sub.contains(c)){
                sub.remove(s.charAt(left));
                left++;
            }
            sub.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;
    }
}
