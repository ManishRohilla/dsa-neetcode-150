class Solution {
    private int max(int[] nums) {
        int max = -1;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }
        return max;
    }

    private long totalHours(int[] nums, int speed) {
        long total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += (long) Math.ceil((double) nums[i] / speed);
        }
        return total;
    }

    public int minEatingSpeed(int[] piles, int h) {
        long sum = 0;
        for (int pile : piles) {
            sum += pile;
        }

        int start = (int) Math.max(1, Math.floorDiv(sum, h)); // lower bound
        int end = max(piles); // upper bound
        int result = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long currHour = totalHours(piles, mid);

            if (currHour <= h) {
                result = mid;       // possible answer
                end = mid - 1;      // try slower speed
            } else {
                start = mid + 1;    // need faster speed
            }
        }

        return result;
    }
}
