class Solution:
    def maxSlidingWindow(self, nums: List[int], k: int) -> List[int]:
        sums =[]
        l = 0 
        for r in range(k-1,len(nums)):
            print(nums[l:r+1])
            sums.append(max(nums[l:r+1]))
            l+=1
        return sums
        