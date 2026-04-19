class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int n: nums){
            freq.put(n, freq.getOrDefault(n,0)+1);
        }

        List<Integer>[] bucket = new List[nums.length +1];
        for(int key: freq.keySet()){
            int count = freq.get(key);
            if(bucket[count]==null){
                bucket[count] = new ArrayList<>();
            }
            bucket[count].add(key);
        }

        List<Integer> result = new ArrayList<>();
        for(int i = bucket.length - 1; i>=0 && result.size()<k; i--){
            if(bucket[i]!= null){
                result.addAll(bucket[i]);
            }
        }

        return result.stream().mapToInt(x->x).limit(k).toArray();
    }
}
