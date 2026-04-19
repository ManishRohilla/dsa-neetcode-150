class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> state = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            if(state.containsKey(target-nums[i])){
                return new int []{state.get(target-nums[i]), i};
            }
            state.put(nums[i],i);
        }

        return new int[]{-1,-1};   
    }
}
