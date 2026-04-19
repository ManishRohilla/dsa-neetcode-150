class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> nums_set = new HashSet<>();
        for(int n: nums){
            nums_set.add(n);
        }

        return !(nums.length == nums_set.size());
    }
}