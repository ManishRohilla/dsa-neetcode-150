class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> freq = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars); // sort letters
            String key = new String(chars); // sorted string as key

            freq.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }

        return new ArrayList<>(freq.values());
    }
}
