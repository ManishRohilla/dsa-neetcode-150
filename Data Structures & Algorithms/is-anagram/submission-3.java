class Solution {
    public boolean isAnagram(String s, String t) {
        int[] state_s = new int[26];
        int[] state_t = new int[26];
        for(int i = 0; i<26; i++){
            state_s[i] = 0;
            state_t[i] = 0;
        }

        for(char c: s.toCharArray()){
            state_s[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            state_t[c - 'a']++;
        }
        return Arrays.equals(state_s,state_t);
    }
}
