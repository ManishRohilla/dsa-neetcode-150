class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        freqMap = dict()
        for i in nums:
            if i in freqMap:
                freqMap[i]+=1
            else:
                freqMap[i] = 1
        print(freqMap)
        n = len(nums)
        bucket = [[] for _ in range(n+1)]
        for num, freq in freqMap.items():
            bucket[freq].append(num)
        print(bucket)

        result = []
        
        for i in range(n, 0 , -1):
            for num in bucket[i]:   
                result.append(num)
                if (len(result)) == k:
                    return result

        return result
        