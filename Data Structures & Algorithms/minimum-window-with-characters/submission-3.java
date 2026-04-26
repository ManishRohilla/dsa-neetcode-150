class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> mapT = new HashMap<>();
        for (int i = 0; i<t.length(); i++){
            mapT.put(t.charAt(i), mapT.getOrDefault(t.charAt(i), 0)+1);
        } 
        System.out.println(mapT.toString());
        int unique = mapT.size();
        int found = 0;
        int l = 0, r = 0;
        int[] ans = {-1,0,0};
        Map<Character, Integer> subString = new HashMap<>();
        while(r < s.length()){
            char c = s.charAt(r);
            subString.put(c, subString.getOrDefault(c, 0)+1);
            if(mapT.containsKey(c) && subString.get(c).intValue() == mapT.get(c).intValue()){
                found++;
            }
            while(l<=r && found == unique){
                c = s.charAt(l);
                if (ans[0]== -1 || ans[0]>r-l+1)
                {
                    ans[0] = r-l+1;
                    ans[1] = l;
                    ans[2] = r;
                }
                subString.put(c, subString.get(c) - 1);
                if(mapT.containsKey(c) && mapT.get(c).intValue() > subString.get(c).intValue()){
                    found--;
                }
                l++;
            }
            r++;
        }
        if(ans[0]==-1){
            return "";
        }
        return s.substring(ans[1], ans[2]+1);
    }
}
