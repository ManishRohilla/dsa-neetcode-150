class TimeMap {
    private Map<String ,List<Pair>> store;
    public TimeMap() {
        store = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        store.putIfAbsent(key, new ArrayList<>());
        store.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!store.containsKey(key)) return "";
        List<Pair> sub = store.get(key);
        int start = 0;
        int end = sub.size()-1;
        String result = "";
        while (start<= end){
            int mid = start + (end-start)/2;
            if(sub.get(mid).time <= timestamp){
                result = sub.get(mid).value;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }
    private static class Pair{
        int time;
        String value;
        Pair(int time, String value){
            this.time = time;
            this.value = value;
        }
    }
}
