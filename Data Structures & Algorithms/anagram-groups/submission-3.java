class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> freq = new HashMap<>();
        for (String s: strs){
            int[] state = new int[26];
            for(char c: s.toCharArray()){
                state[c - 'a']++;
            }
            String key = Arrays.toString(state);
            if(!freq.containsKey(key)){
                freq.put(key, new ArrayList<>(Arrays.asList(s)));
            }
            else{
            freq.get(key).add(s);}
        }
        return new ArrayList<>(freq.values());     
    }
}
