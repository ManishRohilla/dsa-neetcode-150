class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> windowMax = new ArrayDeque<>();
        Vector<Integer> result = new Vector<>();
        for (int i = 0; i < k; i++){
            while(windowMax.size()>0 && nums[windowMax.peekLast()]<=nums[i]){
                windowMax.removeLast();
            }
            windowMax.addLast(i);
        }
        for (int i = k; i<nums.length; i++) {
            result.add(nums[windowMax.peekFirst()]);
            while(windowMax.size()>0 && windowMax.peekFirst()<=i-k){
                windowMax.removeFirst();
            }
            while(windowMax.size()>0 && nums[windowMax.peekLast()]<nums[i]){
                windowMax.removeLast();
            }
            windowMax.addLast(i);
        }
        result.add(nums[windowMax.peekFirst()]);
        return result.stream().mapToInt(x -> x).toArray();
    }
}
