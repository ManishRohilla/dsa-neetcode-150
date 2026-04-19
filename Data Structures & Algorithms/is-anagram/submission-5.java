class Solution {
    public boolean isAnagram(String s, String t) {
        int[] state = new int[26];
        for(int i = 0; i<26; i++){
            state[i] = 0;
        }

        for(char c: s.toCharArray()){
            state[c - 'a']++;
        }
        for(char c: t.toCharArray()){
            state[c - 'a']--;
        }
        for(int n : state){
            if (n!=0) return false;
        }
        return true
        ;
    }
}
