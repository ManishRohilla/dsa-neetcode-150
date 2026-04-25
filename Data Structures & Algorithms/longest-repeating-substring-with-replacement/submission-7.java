class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];
        Arrays.fill(freq,0);
        int left = 0, right = 0, maxLen = 0, maxFreq =0;
        while(right<s.length()){
            maxFreq = Math.max(maxFreq, ++freq[s.charAt(right) - 'A']);
            if(right - left + 1 - maxFreq >k){
                freq[s.charAt(left) - 'A']--;
                left++;
            } 
            maxLen = Math.max(maxLen, right-left+1);
            right++;
        }
        return maxLen;
    }
}
