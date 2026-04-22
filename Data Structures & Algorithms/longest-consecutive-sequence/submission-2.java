class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> numSet = new HashSet<>();
        for(int num: nums){
            numSet.add(num);
        }

        int longestSeq = 1;
        for(int num: numSet){
            if (numSet.contains(num-1)) continue;
            else{
                int currentNum = num;
                int currentSeq = 1;
                while(numSet.contains(currentNum+1)){
                    currentNum++;
                    currentSeq++;
                }
                longestSeq = Math.max(currentSeq, longestSeq); 
            }
        }
        return longestSeq;
    }
}
